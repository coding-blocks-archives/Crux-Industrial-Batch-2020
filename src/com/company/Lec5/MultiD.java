package com.company.Lec5;

import java.util.Scanner;

public class MultiD {

    public static void main(String[] args) {

        int ar[][] = new int[3][2];

        int ar1[][]= { {1,2,3,4} , {6,7,8,9} , {11,12,13,14},{17,16,15,21}};

//        waveprint(ar1);

        spiral(ar1);

//        Scanner s= new Scanner(System.in);
////
//        for (int i = 0; i <ar1.length ; i++) {
//
//            for (int j = 0; j <ar1[i].length ; j++) {
//
//                System.out.println(ar1[i][j]);
//            }
//        }
//
//        for (int i = 0; i <ar.length ; i++) {
//
//            for (int j = 0; j <ar[i].length ; j++) {
//
//                ar[i][j]= s.nextInt();
//            }
//        }
    }

    public static void waveprint(int ar[][]){


        for (int i = 0; i <ar.length ; i++) {

            if(i%2 ==0) {
                for (int j = 0; j <ar[i].length; j++) {
                    System.out.println(ar[i][j]);
                }
            }
            else{

                for (int j = ar[i].length-1; j >=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }

    public static void spiral(int ar[][]) {

        int top = 0;
        int bottom = ar.length - 1;
        int left = 0;
        int right = ar[0].length - 1;

        while (top<=bottom && left<=right) {

            for (int i = left; i <=right; i++) {
                System.out.println(ar[top][i]);
            }

            top=top+1;

            for (int i = top; i <=bottom; i++) {
                System.out.println(ar[i][right]);
            }
            right=right-1;

            for (int i = right; i >=left; i--) {
                System.out.println(ar[bottom][i]);
            }
            bottom=bottom-1;

            for (int i = bottom; i >=top; i--) {
                System.out.println(ar[i][left]);
            }
            left=left+1;
        }
    }



}
