package com.company.Lec9;

import java.util.Arrays;

public class LexoPermute {

    public static void main(String[] args) {

        String s = "abc";

        int fre[] = frequency(s);

        System.out.println(Arrays.toString(fre));

        lexoperm(fre,"",s.length());

    }

    public static void lexoperm(int freq[], String processed, int length){

        if(length==0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <freq.length ; i++) {

            if(freq[i]>0){
                freq[i]--;
                lexoperm(freq,processed+(char)(i+'a'),length-1);
                freq[i]++;
            }
        }

    }

    private static int[] frequency(String s) {

        int ar[]= new int[26];

        for (int i = 0; i <s.length(); i++) {

            char ch= s.charAt(i);

            ar[ch-'a']++;
        }

        return ar;
    }


}

