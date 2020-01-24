package com.company.Lec2;

public class Functioneg {

    public static void main(String[] args) {
        fun();
       int p= sum(5,6);
        System.out.println(p);
     }

    public static void fun(){
        System.out.println("hello");
    }

    public static int sum(int a, int b){

        int sum= a+b;
        return sum;
    }
}
