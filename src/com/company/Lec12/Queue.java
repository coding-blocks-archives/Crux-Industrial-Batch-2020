package com.company.Lec12;

public class Queue {

    private int DEFAULT_SIZE=10;

    private int end;
    private int[] ar;

    public Queue(){
        this.ar=new int[DEFAULT_SIZE];
        this.end=0;
    }

    public boolean isFull(){
        return end==ar.length;
    }

    public void insert(int element){
        if(isFull()){
            return;
        }

        ar[end++]=element;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public int remove(){

        if(isEmpty()){
            return -1;
        }

        int temp= ar[0];
        for (int i = 1; i <end ; i++) {
            ar[i-1]=ar[i];
        }

        end--;
        return temp;
    }

    public void display() {

        for (int i = 0; i < end; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
