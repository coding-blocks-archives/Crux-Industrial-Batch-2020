package com.company.Lec3;

public class Util {

    public static void main(String[] args) {

        int[] ar= {1,2,3,4,5};

        System.out.println(ar[0]+ " "+ ar[1]);
//        swap(ar);
        System.out.println(ar[0]+ " "+ ar[1]);
        System.out.println(maxvalue(ar));
        System.out.println(maxindex(ar));

    }

    public static void swap(int ar[],int i, int j){

        int temp= ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static int maxvalue(int ar[]){

        int max=Integer.MIN_VALUE;

        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }

    public static int maxindex(int ar[]){

        int max=0;

        for (int i = 1; i <ar.length ; i++) {

            if(ar[i]>ar[max]){
                max = i;
            }
        }
        return max;
    }





}
