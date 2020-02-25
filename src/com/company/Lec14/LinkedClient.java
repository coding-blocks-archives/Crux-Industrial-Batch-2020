package com.company.Lec14;

public class LinkedClient {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertatlast(4);
        list.insertatlast(5);
        list.insertatlast(6);

        System.out.println(list.deletefirst());
        System.out.println(list.deleteLast());

        list.display();
    }
}
