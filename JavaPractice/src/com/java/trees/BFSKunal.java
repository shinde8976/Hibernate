package com.java.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSKunal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(BST.Node root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<BST.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                BST.Node currentNode = queue.poll();
                currentLevel.add(currentNode.value);
                if (currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }



        return result;
    }
}
