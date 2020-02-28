package com.company.Lec16;

public class QueueClient {

    public static void main(String[] args) {

        DynamicQueue queue = new DynamicQueue();
        for (int i = 1; i <=100 ; i++) {
            queue.insert(i);
        }
        System.out.println(queue.remove());
        queue.insert(10);
        for (int i = 0; i <100 ; i++) {
            System.out.println(queue.remove());

        }

    }
}
