package com.company.Lec2;

import java.util.Scanner;

public class ftoc {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int start= s.nextInt();
        int end =s.nextInt();
        int step=s.nextInt();

        fartocel(start,end,step);

    }

    public static void fartocel(int start,int end ,int step) {

        while(start<=end){

            float c=((5f/9)*(start-32));
            System.out.println(c);
            start=start+step;
        }

    }
}
