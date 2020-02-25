package com.company.Lec14;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size=0;

    public void insertfirst(int value){

        Node node= new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertatlast(int element){

        if(size==0){
            insertfirst(element);
            return;
        }

        Node node= new Node(element);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deletefirst(){

        if(size==0){
            return -1;
        }

        int value= head.value;

        head=head.next;
        size--;
        return value;
    }

    public int deleteLast(){

        if(size<2){
           return deletefirst();
        }

        Node temp = head;

        while(temp.next!=tail){

            temp=temp.next;
        }

        int value =temp.next.value;
        temp.next=null;
        tail=temp;
        size--;
        return value;
    }


    public void display(){

        Node temp= head;

        while(temp!=null){

            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    protected class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
