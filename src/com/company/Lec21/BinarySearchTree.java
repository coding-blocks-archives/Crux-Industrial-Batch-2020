package com.company.Lec21;

import java.util.Scanner;

public class BinarySearchTree {


    private Node root;

    public void insert(int val){
        this.root= insert(root,val);
    }

    private Node insert(Node node, int val) {

        if(node==null){
//            Node node1 =new Node(value);
            return new Node(val);
        }

        if(node.value>val){
            node.left=insert(node.left,val);
        }

        else{
            node.right=insert(node.right,val);
        }

        return node;
    }

    public void preorder(){
        preorder(root,"");
    }

    private void preorder(Node node, String indent){

        if(node==null){
            return;
        }

        System.out.println(indent+node.value);

        preorder(node.left,indent+"\t");
        preorder(node.right,indent+"\t");

    }

    public int successor(int value){

        Node success=null;

        Node current =root;

        while(current!=null){

            if(current.value>value){


                if(success==null || success.value>current.value){

                    success=current;
                }

                current=current.left;
            }

            else{
                current=current.right;
            }

        }
        return success.value;
    }

    public void inrange(int k1, int k2){
        inrange(root,k1,k2);
    }

    public void sort(Node node){
        if(node==null){
            return;
        }

        sort(node.left);
        System.out.println(node.value);
        sort(node.right);
    }

    public void inrange(Node node, int k1, int k2){

        if(node==null){
            return;
        }

        if(node.value>k1 &&node.value<k2){
            System.out.println(node.value);
        }


        if(node.value>k1){
           inrange(node.left,k1,k2);
        }

        if(node.value<k2){
            inrange(node.right,k1,k2);
        }

    }

    public void makefromsorted(int ar[],int start, int end){

        if(start>end){
            return;
        }

        int mid=(start+end)/2;

        insert(ar[mid]);

        makefromsorted(ar,start,mid-1);
        makefromsorted(ar,mid+1,end);
    }


    private class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
