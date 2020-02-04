package com.company.Lec7;

public class LearningRec {

    public static void main(String[] args) {

        pd4();
    }

    public static void pd4(){

        System.out.println("4");
        pd3();
    }

    public static void pd3(){
        System.out.println("3");
        pd2();
    }

    public static void pd2(){
        System.out.println("2");
        pd1();
        System.out.println("jaa rha hun");
    }

    public static void pd1(){
        System.out.println("1");
    }
}
