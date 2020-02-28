package com.company.Lec17_18;

public class ListClient {


    public static void main(String[] args) {

        LinkedList list= new LinkedList();

//        list.insertfirst(3);
//        list.insertfirst(2);
//        list.insertfirst(1);
////        System.out.println(list.deletefirst());
//        list.insertlast(4);
//        list.insertlast(5);


//        list.insertbetween(0,9);
//        list.insertbetween(4,8);
//
//        list.display();
//        System.out.println();
//
//
//        System.out.println(list.deletebetween(2));
//
//        System.out.println(list.deletebetween(4));

        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(3);
        list.insertlast(4);
        list.insertlast(5);
//        list.insertlast(6);
//        list1.display();
//        System.out.println();
//        list.duplicates();
//        list.display();

//        System.out.println(list.find(5));
//
//        list.reverse();
//        list.display();
//
//        LinkedList list2 = new LinkedList();
//        list= list.merge(list2,list1);

//        list2=list2.oddeven(list);
//        list.oddeven1();
//        list.display();
//        System.out.println(list.mid());
//
//        LinkedList list1 =new LinkedList();
//        list1=list1.mergesort(list);
        System.out.println(list.kthfromlast(3));
        list.display();
    }
}
