package com.company.Lec7;

public class Recursioneg {

    public static void main(String[] args) {

        pboth(4);

//        fibo(4);
    }

    public static void pboth(int n){

//        if(n==0){
//            return;
//        }

        System.out.println(n);
        pboth(n-1);

    }

    public static int fact(int n){

        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-2)+fibo(n-1);
    }
}
