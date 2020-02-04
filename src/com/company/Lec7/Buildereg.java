package com.company.Lec7;

public class Buildereg {

    public static void main(String[] args) {

        String s ="";

        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i <1000000 ; i++) {

            builder.append('a');
        }

        builder.setCharAt(0,'z');

        System.out.println('c'-'a');
        System.out.println(builder);
    }

    public static StringBuilder toggle(String str){

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(ch>= 'A'  && ch<='Z'){
                ch = (char)('a'+(ch-'A'));
            }
            else{
                ch = (char)('A'+(ch-'a'));
            }

            builder.setCharAt(i,ch);
        }

        return builder;
    }
}
