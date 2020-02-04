package com.company;

import java.util.ArrayList;

public class Strings {

    public static void main(String[] args) {

//        String s= new String("hello");
//
//        String s1= new String("Hello");
//
//        String p1 =new String("hello");
//
//        System.out.println(s1.equals(p1));
//
//        System.out.println(s1.substring(1));
//
//        System.out.println(s1.substring(1,3));
//
//        System.out.println(s1.charAt(0));
//
//        System.out.println(s1.indexOf('e'));
//
//        System.out.println(s1.indexOf('l',3));

//        occurences("hello","l");
//
//        substrings("hello");

        String s1= "hell";

//        System.out.println(s1.subSequence(2,4));

//        pallin("abc");
    }

    public static void occurences(String str,String pattern){

        int index= 0;

        while(true){

            index= str.indexOf(pattern,index);

            if(index==-1){
                break;
            }

            System.out.println(index);
            index=index+1;
        }
    }

    public static void substrings(String s){

        for (int i = 0; i <s.length(); i++) {

            for (int j = i+1; j <=s.length() ; j++) {

                System.out.println(s.substring(i,j));
            }
        }
    }

    public static void pallin(String str){

        int start=0;
        int end=str.length()-1;

        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("not pallin");
                return;
            }

            start++;
            end--;
        }
        System.out.println("pallindrome");
    }
}
