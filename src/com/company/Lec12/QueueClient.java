package com.company.Lec12;

public class QueueClient {

    public static void main(String[] args) {

        OptimizedQueue queue = new OptimizedQueue();
        for (int i = 0; i <9 ; i++) {
            queue.insert(i);
            queue.display();
        }

        for (int i = 0; i <9 ; i++) {
            queue.remove();
            queue.display();
        }

    }
}
