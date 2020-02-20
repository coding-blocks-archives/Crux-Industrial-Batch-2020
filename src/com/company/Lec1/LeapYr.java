package com.company.Lec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeapYr {

    public static void main(String[] args) {

        int yr=2004;

        File file = new File("hello.txt");

        try {
            Scanner s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(yr%4==0)
            System.out.println("leap yr");
        else{
            System.out.println("not a leap yr");
        }


    }
}
