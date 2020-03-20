package com.company.Lec23;

public class HeapClient {

    public static void main(String[] args) throws Exception {

        Heaps heap = new Heaps();
        heap.add(5);
        heap.add(3);
        heap.add(4);
        heap.add(2);
//        heap.add(1);
        heap.display();
    }
}
