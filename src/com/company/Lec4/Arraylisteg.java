package com.company.Lec4;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylisteg {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList();
        Scanner s= new Scanner(System.in);
        char ch=s.next().charAt(0);
        int a=4;
        list.add(a);
//        list.add("hello baby");
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.set(0,2));
        System.out.println(list);
//        System.out.print(list.cl);
    }
}
