package com.company.Lec1;
import java.util.Scanner;

public class Loopeg {

    public static void main(String[] args) {

        int i=1;

        Scanner s = new Scanner(System.in);
        Scanner a=s;
        int n= s.nextInt();

        while(i<=n){
            System.out.println(i);
            i=i+1;
        }
    }
}
