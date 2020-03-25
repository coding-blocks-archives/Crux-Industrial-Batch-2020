package com.company.Lec22;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BSTwithGenerics<T extends Comparable<T>> {


    private Node root;

    public void insert(T val){
        this.root= insert(root,val);
    }

    private Node insert(Node node, T val) {

        if(node==null){
//            Node node1 =new Node(value);
            return new Node(val);
        }

        if(node.value.compareTo(val)>0){
            node.left=insert(node.left,val);
        }

        else{
            node.right=insert(node.right,val);
        }

//        node.height= Math.max(height(node.left),height(node.right))+1;

        return node;
    }
//
//    public void populateprein(T pre[], T in[]){
//
//        this.root= populateprein(root,pre,in);
//    }

//    private Node populateprein(Node node, T[] pre, T[] in) {
//
//        if(in.length==0){
//            return null;
//        }
//
//        T ele=pre[0];
//        int index=find(in,ele);
//
//        T pre_left[]= Arrays.copyOfRange(pre,1,index+1);
//        T pre_right[]=Arrays.copyOfRange(pre,index+1,pre.length);
//
//        T in_left[]=Arrays.copyOfRange(in,0,index);
//        T in_right[]=Arrays.copyOfRange(in,index+1,in.length);
//
//        Node node1= new Node(ele);
//
//        node1.left= populateprein(node1.left,pre_left,in_left);
//        node1.right=populateprein(node1.right,pre_right,in_right);
//
//        return node1;
//    }
//
//    private int height(Node node){
//
//        if(node==null){
//            return 0;
//        }
//
//        return node.height;
//    }
//
//    private int find(T[] in, T ele) {
//
//        for (int i = 0; i <in.length ; i++) {
//
//            if(in[i].compareTo(ele)==0){
//                return i;
//            }
//        }
//        return -1;
//    }
//
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
//
//    public T successor(T value){
//
//        Node success=null;
//
//        Node current =root;
//
//        while(current!=null){
//
//            if(current.value.compareTo(value)>0){
//
//
//                if(success==null || success.value.compareTo(current.value)>0){
//
//                    success=current;
//                }
//
//                current=current.left;
//            }
//
//            else{
//                current=current.right;
//            }
//
//        }
//        return success.value;
//    }
//
////    public void inrange(int k1, int k2){
////        inrange(root,k1,k2);
////    }
//
//    public void sort(Node node){
//        if(node==null){
//            return;
//        }
//
//        sort(node.left);
//        System.out.println(node.value);
//        sort(node.right);
//    }

//    public void inrange(Node node, int k1, int k2){
//
//        if(node==null){
//            return;
//        }
//
//        if(node.value>k1 &&node.value<k2){
//            System.out.println(node.value);
//        }
//
//
//        if(node.value>k1){
//           inrange(node.left,k1,k2);
//        }
//
//        if(node.value<k2){
//            inrange(node.right,k1,k2);
//        }
//    }

//    public void makefromsorted(int ar[],int start, int end){
//
//        if(start>end){
//            return;
//        }
//
//        int mid=(start+end)/2;
//
//        insert(ar[mid]);
//
//        makefromsorted(ar,start,mid-1);
//        makefromsorted(ar,mid+1,end);
//    }

//    public void levelorder(){
//        if(root==null){
//            return;
//        }
//
//        Queue<Node> queue= new LinkedList();
//        queue.add(root);
//
//        while(!queue.isEmpty()){
//
//            Node temp = queue.remove();
//            System.out.println(temp.value);
//
//            if(temp.left!=null){
//                queue.add(temp.left);
//            }
//
//            if(temp.right!=null){
//                queue.add(temp.right);
//            }
//        }
//    }

    private class Node{

        T value;
        Node left;
        Node right;
        int height;

        public Node(T value) {
            this.value = value;
            this.height=1;
        }
    }
}
