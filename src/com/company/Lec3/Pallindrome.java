package com.company.Lec3;

public class Pallindrome {

    public static void main(String[] args) {
        int n=1231;
        int rev= reverse(n);

        if(rev==n){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }

    }

    public static int reverse(int n){

        int rev=0;

        while(n>0){

            int r= n%10;
            n=n/10;
            rev = rev*10 + r;
        }

        return rev;
    }

}


