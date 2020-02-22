package com.company.Lec12;

public class QueueClient {

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();
        for (int i = 1; i <=10 ; i++) {
            queue.insert(i);
        }
        System.out.println(queue.remove());
        queue.insert(10);
        for (int i = 0; i <9 ; i++) {
            System.out.println(queue.remove());

        }

    }
}
