package com.company.Lec16;

public class DynamicStack extends Stack {

    @Override
    public void push(int element) {
        if(isFull()){

            int data[]=new int[2*ar.length];

            for (int i = 0; i <ar.length ; i++) {
                data[i]=ar[i];
            }
            ar=data;
        }
        super.push(element);
    }
}
