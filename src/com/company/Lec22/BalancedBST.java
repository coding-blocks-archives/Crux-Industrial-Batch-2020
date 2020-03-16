package com.company.Lec22;

public class BalancedBST {

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

        node.height= Math.max(height(node.left),height(node.right))+1;

        return node;
    }




    private int height(Node node){

        if(node==null){
            return 0;
        }

        return node.height;
    }


    private class Node{

        int value;
       Node left;
       Node right;
        int height;

        public Node(int value) {
            this.value = value;
            this.height=1;
        }
    }
}
