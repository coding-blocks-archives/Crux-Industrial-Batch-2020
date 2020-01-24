package com.company.Lec2;

public class Swapper {

    public static void main(String[] args) {

        int a=2;
        int b=3;
        System.out.println(a + " " + b);
        swap(a,b);

        System.out.println(a + " " + b);
    }

    public static int swap(int a, int b){

        int t= a;
        a=b;
        b=t;

        return a;
    }
}
