package com.java.trees;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8};
        SegmentTree tree = new SegmentTree(arr);
    }
    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        //Create Tree using array;
        this.root = constructTree(arr,0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if (start == end){
            //Leaf Node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        //Create New NOde with  index you are at
        Node node = new Node(start, end);
        int mid = (start + end )/2;

        node.left = this.constructTree(arr,start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";
        if (node.left != null){
            str = str + "Interval=[" + node.left.startInterval +"-"+node.left.endInterval +"] and data: " + node.left.data+"+ ->";

        }else{
            str = str +" No left child";
        }

        //For current node
        str = str + "Interval=[" + node.startInterval +"-"+node.endInterval +"] and data: " + node.data+"+ ->";

        if (node.right != null){
            str = str + "Interval=[" + node.right.startInterval +"-"+node.right.endInterval +"] and data: " + node.left.data+"+ ->";

        }else{
            str = str +" No Right child";
        }

        System.out.println(str);

        //Call recursion
        if (node.left != null){
            display(node.right);
        }
        if (node.right != null){
            display(node.right);
        }
    }
}
