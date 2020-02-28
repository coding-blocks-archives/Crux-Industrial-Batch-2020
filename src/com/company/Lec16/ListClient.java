package com.company.Lec16;

public class ListClient {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        for (int i = 0; i <=100 ; i++) {
            list.add(i);
        }

        System.out.println(list.remove());
        System.out.println(list.remove());
    }
}
