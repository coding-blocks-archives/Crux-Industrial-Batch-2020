package com.company.Lec25;


public class MapClient {

    public static void main(String[] args) {


        String s="orange";
        System.out.println(s.hashCode());
        MapUsingArray map = new MapUsingArray();

//        map.put("apple", "padhne laga he");
        map.put("apple", "with his gf");
        map.put("orange","Partying hard");

//        System.out.println(map.get("apple"));
        System.out.println(map.get("orange"));

        System.out.println(map.get("apple"));
//        map.remove("Saransh");
//        System.out.println(map.get("Saransh"));

    }
}
