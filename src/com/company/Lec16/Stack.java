package com.company.Lec16;

public class Stack {

    protected int DEFAULT_SIZE=10;

    protected int[] ar;

    protected int top;

    public Stack(){
        this.ar= new int[DEFAULT_SIZE];
        this.top=0;
    }

    public boolean isFull(){
        return top==ar.length;
    }

    public void push(int element){

        if(isFull()){
            return;
        }

        ar[top++]=element;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public int pop() throws Exception{

        if(isEmpty()){
           throw new Exception("khaali he be");
        }

        int temp=ar[top-1];
        top--;
        return temp;
    }

//    public int top(){
//
//    }
}
