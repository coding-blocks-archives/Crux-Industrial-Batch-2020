package com.company.Lec25;


public class MapClient {

    public static void main(String[] args) {


        String s="orange";
        System.out.println(s.hashCode());
        MapUsingLL map = new MapUsingLL();

        map.put("Saransh", "padhne laga he");
        map.put("Vansh", "with his gf");
        map.put("Ritik","Partying hard");

        System.out.println(map.get("Vansh"));
        System.out.println(map.get("Saransh"));
        System.out.println(map.remove("Saransh"));
        System.out.println(map.get("Saransh"));

    }
}
