package com.company.Lec3;

public class Inverse {

    public static void main(String[] args) {

        System.out.println(inverse(32145));
    }

    public static int inverse(int n){

        int inv=0;
        int place=1;

        while(n>0){

            int r= n%10;
            n=n/10;
            inv=inv+ (int)(place*Math.pow(10,r-1));
            place=place+1;
        }

        return inv;
    }
}
