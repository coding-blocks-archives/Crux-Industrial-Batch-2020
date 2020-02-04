package com.company.Lec8;

public class StringRec {

    public static void main(String[] args) {

        subsequence("","abc");

        permutation("","abc");
    }

    public static void subsequence(String processed, String unprocessed){

        if(unprocessed.isBlank()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        subsequence(processed+ch,unprocessed);
        subsequence(processed,unprocessed);
    }

    public static void permutation(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        for (int i = 0; i <=processed.length() ; i++) {

            String first= processed.substring(0,i);
            String second =processed.substring(i);

            permutation(first+ch+second,unprocessed);
        }
    }



}
