package com.company.Lec24;


import com.company.Lec24.Human;

import java.util.ArrayList;
import java.util.Collections;

public class HumanCLient {

    public static void main(String[] args) {

        ArrayList<Human> list =new ArrayList<>();

        list.add(new Human("L",12));
        list.add(new Human("A",11));
        list.add(new Human("S",10));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for (Human human: list) {
            System.out.println(human.name+" "+ human.age);
        }
    }
}
