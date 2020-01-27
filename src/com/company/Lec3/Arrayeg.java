package com.company.Lec3;

import java.util.Scanner;

public class Arrayeg {

    public static void main(String[] args) {

        int[] ar = new int[5];

        int[] ar1= {1,2,3,4,5};
//        String s="hello";
        Scanner s = new Scanner(System.in);

//        for (int i = 0; i <ar.length ; i++) {
//            System.out.println(ar[i]);
//        }

        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }

        for (int i = 0; i <ar.length ; i++) {
            System.out.println(ar[i]);
        }

    }
}
