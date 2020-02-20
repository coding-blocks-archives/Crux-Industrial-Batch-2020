package com.company.Lec12;

public class StackClient {

    public static void main(String[] args) throws Exception {


        Stack stack= new Stack();


        for (int i = 0; i <=15 ; i++) {
            stack.push(i);
        }

        try {
            for (int i = 0; i <= 15; i++) {
                stack.pop();
            }
        }
        finally {
            System.out.println("bala");
            System.out.println("bhola");
        }


    }


}
