package com.company.Lec26;

public class MapClient {

    public static void main(String[] args) {

        MapusingAL<String,Integer> map = new MapusingAL<>();

        for (int i = 0; i <1000 ; i++) {
            map.add("a"+i,i);
        }

        for (int i = 0; i <1000 ; i++) {
            System.out.println(map.get("a"+i));
        }
    }
}
