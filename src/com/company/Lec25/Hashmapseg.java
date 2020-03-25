package com.company.Lec25;

import java.util.HashMap;
import java.util.Map;

public class Hashmapseg {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Varun", "Hardworking");
        map.put("Saransh", "Padhta nhi aajkal");
        map.put("Debayan", "I LOve YOu all");

        System.out.println(map);

        for (String string: map.keySet()) {
            System.out.println(string);
        }

        for (String string : map.values()) {
            System.out.println(string);
        }

        System.out.println(map.get("Debayan"));

        System.out.println(frequency("aaAbbc"));

        System.out.println(map.get("Tanuj"));

        map.remove("Saransh");

        System.out.println(map);

        System.out.println(map.get("Saransh"));

    }


    public static HashMap<Character, Integer> frequency(String str){

        HashMap<Character,Integer> freq =new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(!freq.containsKey(ch)){
                freq.put(ch,1);
            }

            else{
                freq.put(ch,freq.get(ch)+1);
            }
        }

        return freq;
    }

    // Count all vowels


}
