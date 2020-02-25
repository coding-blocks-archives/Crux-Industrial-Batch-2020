package com.company.Lec14;

public class CircularQueue {

    protected int DEFAULT_SIZE=10;

    protected int end;
    protected int[] ar;
    protected int front;
    protected int size;

    public CircularQueue(){
        this.ar=new int[DEFAULT_SIZE];
        this.end=0;
        this.front=0;
        this.size=0;
    }

    public boolean isFull()
    {
        return size==ar.length;

    }

    public void insert(int element){
        if(isFull()){
            return;
        }

        ar[end++]=element;
        end= end %ar.length;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int remove(){

        if(isEmpty()){
            return -1;
        }

        int temp= ar[front];
//        for (int i = 1; i <end ; i++) {
//            ar[i-1]=ar[i];
//        }

        front++;
        front=front% ar.length;
        size--;
        return temp;
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(ar[(front+i)%ar.length] + " ");
        }
        System.out.println();
    }
}
