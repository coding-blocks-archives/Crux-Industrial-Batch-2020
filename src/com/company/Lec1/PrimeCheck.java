package com.company.Lec1;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int i=2;
        int flag=0;

        while(i < n){

            if(n%i==0){

                flag=1;
                break;
            }
            i=i+1;
        }

        if(flag==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }

}
