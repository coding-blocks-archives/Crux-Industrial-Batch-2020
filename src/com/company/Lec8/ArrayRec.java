package com.company.Lec8;

import com.company.Lec4.Util;

import java.util.Arrays;

public class ArrayRec {

    public static void main(String[] args) {

        int ar[]= {1,2,10,4,5,6};
        System.out.println(linear(ar,0,5));

        System.out.println(checksort(ar,0));

        pattern(4,0);

        bubble(ar,ar.length-1,0);

        System.out.println(Arrays.toString(ar));
    }

    public static int linear(int ar[],int index,int element){

        if(ar.length==index){
            return -1;
        }

        if(ar[index]==element){
            return index;
        }

        return linear(ar,index+1,element);
    }

    public static boolean checksort(int ar[],int index){

        if(ar[index]>ar[index+1]){
            return false;
        }

        if (index == ar.length-1) {
            return true;
        }

        return checksort(ar,index+1);
    }


    public static void pattern(int row, int col){

        if(row==0){
            return;
        }

        if(col==row){
            System.out.println();
            pattern(row-1,0);
            return;
        }

        System.out.print("*");
        pattern(row,col+1);
    }

    public static void bubble(int ar[], int row, int col){

        if(row==0){
            return;
        }

        if(col==row){
            bubble(ar,row-1,0);
            return;
        }

        if (ar[col] > ar[col+1]) {
            Util.swap(ar,col,col+1);
        }
        bubble(ar,row,col+1);
    }


}
