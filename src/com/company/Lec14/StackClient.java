package com.company.Lec14;

import com.company.Lec12.Stack;

public class StackClient {

    public static void main(String[] args) throws Exception {


        DynamicStack stack= new DynamicStack();


        for (int i = 0; i <=150 ; i++) {
            stack.push(i);
        }

        try {
            for (int i = 0; i <= 150; i++) {
                System.out.println(stack.pop());
            }
        }

        catch(Exception e){
            System.out.println(e);
        }
    }


}
