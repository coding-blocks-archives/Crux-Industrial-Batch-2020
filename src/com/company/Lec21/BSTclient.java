package com.company.Lec21;

public class BSTclient {

    public static void main(String[] args) {


        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(5);
//        tree.insert(2);
//        tree.insert(7);
//        tree.insert(3);
//        tree.insert(1);

//        System.out.println(tree.successor(2));
//
//        tree.preorder();
//        tree.inrange();

        int ar[]={1,2,3,4,5,6,7};
        tree.makefromsorted(ar,0,ar.length-1);

        tree.preorder();


    }
}
