package com.company.Lec8;

public class StringRec {

    public static void main(String[] args) {

        Asciisubsequence("","abc");

//        subsequence("","abc");
//
//        permutation("","abc");

//       dicecount("",4);

    }

    public static void subsequence(String processed, String unprocessed){

        if(unprocessed.isBlank()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
//        unprocessed=unprocessed.substring(1);

        subsequence(processed,unprocessed.substring(1));
        subsequence(processed+ch,unprocessed.substring(1));
    }

    public static void Asciisubsequence(String processed, String unprocessed){

        if(unprocessed.isBlank()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
//        unprocessed=unprocessed.substring(1);

        Asciisubsequence(processed+ch,unprocessed.substring(1));
        Asciisubsequence(processed+(int)(ch),unprocessed.substring(1));
        Asciisubsequence(processed,unprocessed.substring(1));
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

    public static int dicecount(String processed, int target){

        if(target==0){

            System.out.println(processed);
            return 1;
        }

        int cnt=0;

        for (int i = 1; i <=6 && i<=target ; i++) {

           cnt+= dicecount(processed+i,target-i);
        }

        return cnt;
    }



}
