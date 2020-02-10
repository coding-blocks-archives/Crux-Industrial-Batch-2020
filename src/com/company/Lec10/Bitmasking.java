package com.company.Lec10;

public class Bitmasking {

    public static void main(String[] args) {

    }

    public static void oddeven(int n){

        if((n&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }

    public static int countset(int n){

        int cnt=0;
        while(n>0){

            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }

        return cnt;
    }
}
