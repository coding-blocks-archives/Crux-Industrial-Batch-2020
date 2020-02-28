package com.company.Lec14;

import java.util.Scanner;
import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        Stack stack = new Stack();
        int n= s.nextInt();

        for (int i = 0; i <n ; i++) {
            stack.push(s.nextInt());
        }

        System.out.println(stack.peek());
        for (int i = 0; i <n ; i++) {
            System.out.println(stack.pop());
        }

    }
}
