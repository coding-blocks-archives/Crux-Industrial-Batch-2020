package com.company.Lec22;


public class BSTclient {

    public static void main(String[] args) {


       BalancedBST tree = new BalancedBST();
       BSTwithGenerics<String> bst = new BSTwithGenerics<>();

        bst.insert("abc");
        bst.insert("abe");
        bst.insert("aaa");
        bst.insert("abz");

//        tree.preorder();
//
//        System.out.println(tree.isbalanced());
//        tree.insert(4);
//        tree.insert(5);


//        System.out.println(tree.successor(2));
//
//        tree.preorder();
//        tree.inrange();

//        int ar[]={1,2,3,4,5,6,7};
//        tree.makefromsorted(ar,0,ar.length-1);
//
        bst.preorder();
//
//        tree.levelorder();

    }
}
