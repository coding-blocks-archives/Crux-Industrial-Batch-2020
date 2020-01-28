package com.company.Lec4;

import java.util.Arrays;

public class ReversalAlgo {

    public static void main(String[] args) {

        int[] ar= {1,2,3,4,5};

        int k=3;

        Util.reverse(ar,0,k-1);
        System.out.println(Arrays.toString(ar));

        Util.reverse(ar,k,ar.length-1);
        System.out.println(Arrays.toString(ar));

        Util.reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));


    }
}
