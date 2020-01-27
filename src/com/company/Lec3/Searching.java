package com.company.Lec3;

public class Searching {

    public static void main(String[] args) {

        int[] ar= {1,2,3,4,5};

//        System.out.println(linear(ar,15));
//
//        int r =linear(ar,15);
//
//        if(r==-1){
//            System.out.println("not found");
//        }
//        else{
//            System.out.println("found");
//        }

        System.out.println(binary(ar,4));
    }

    public static int linear(int ar[],int element){

        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static int binary(int ar[],int element){

        int start=0;
        int end= ar.length-1;

        while(start <= end){

            int mid= (start+end)/2;

            if(ar[mid]==element){
                return mid;
            }

            else if(ar[mid]<element){
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
