package com.company.Lec17_18;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertfirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int value) {
        if (size == 0) {
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public int deletefirst() {

        if (size == 0) {
            System.out.println("khaali he be");
            return -1;
        }

        int temp = head.value;

        head = head.next;
        size--;
        return temp;
    }

    public int deletelast() {

        if (size < 2) {
            return deletefirst();
        }

//        while(temp.next!=tail){
//            temp=temp.next;
//        }
        Node temp = get(size - 2);
        int value = tail.value;
        temp.next = null;
        tail = temp;
        size--;
        return value;

    }

    public Node get(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void insertbetween(int index, int value) {

        if (index == 0) {
            insertfirst(value);
            return;
        }

        if (index == size) {
            insertlast(value);
            return;
        }

        Node temp = get(index - 1);

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deletebetween(int index) {

        if (index == 0) {
            return deletefirst();
        }

        if (index == size - 1) {
            return deletelast();
        }

        Node temp = get(index - 1);
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public void duplicates(){

        Node temp= head;

        while(temp.next!=null){

            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }
        }

        tail=temp;
    }

    public Node find(int element){

        Node temp=head;

        while(temp!=null){

            if(temp.value==element){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void reverse(){
        reverse(head);
    }

    private void reverse(Node node){

        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }

    public LinkedList merge(LinkedList f , LinkedList s){

        LinkedList list= new LinkedList();

        Node first= f.head;
        Node second=s.head;

        while(first!=null && second!=null){

            if(first.value<second.value){
                list.insertlast(first.value);
                first=first.next;
            }
            else{
                list.insertlast(second.value);
                second=second.next;
            }
        }

        while(first!=null){
            list.insertlast(first.value);
            first=first.next;
        }

        while(second!=null){
            list.insertlast(second.value);
            second=second.next;
        }


        return list;
    }

    public LinkedList oddeven(LinkedList list1){

        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        Node temp= list1.head;

        while(temp!=null){

            if(temp.value%2==0){
                even.insertlast(temp.value);
            }
            else{
                odd.insertlast(temp.value);
            }
            temp=temp.next;
        }

        odd.tail.next=even.head;

        odd.tail=even.tail;

        return odd;
    }

    public Node mid(){

        Node temp=head;
        Node temp1=head;

        while(temp1.next!=null && temp1.next.next!=null){

            temp=temp.next;
            temp1=temp1.next.next;
        }


//        while(temp1!=null && temp1.next!=null){
//
//            temp=temp.next;
//            temp1=temp1.next.next;
//        }       //when you need mid as 4 in 1,2,3,4,5,6

        return temp;
    }

    public void oddeven1() {

        Node odd_head=null;
        Node odd_tail=null;
        Node even_head=null;
        Node even_tail=null;

        Node temp=head;

        while(temp!=null){

            if(temp.value%2!=0){

                if(odd_head==null){
                    odd_head=temp;
                    odd_tail=temp;
                }
                else{
                    odd_tail.next=temp;
                    odd_tail=temp;
                }
            }

            else{

                if(even_head==null){
                    even_head=temp;
                    even_tail=temp;
                }
                else{
                    even_tail.next=temp;
                    even_tail=temp;
                }
            }
            temp=temp.next;
        }

        odd_tail.next=even_head;
        head=odd_head;
        tail=even_tail;
        tail.next=null;


    }

    public LinkedList mergesort(LinkedList list){

        if(list.size==1){
            return list;
        }

        Node mid =list.mid();
        LinkedList first = new LinkedList();
        first.head=list.head;
        first.tail=mid;
        first.size=(list.size+1)/2;

        LinkedList second = new LinkedList();
        second.head=mid.next;
        second.tail=list.tail;
        second.size= list.size/2;

        mid.next=null;

        first=mergesort(first);
        second=mergesort(second);

        return merge(first,second);
    }

    public int kthfromlast(int k){

        Node slow=head;
        Node fast=head;

        for (int i = 0; i <k ; i++) {
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.value;
    }



}
