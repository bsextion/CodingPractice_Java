package com.RES;

public class DFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        traverse(root);
    }

    public static void traverse(TreeNode root){
        if (root != null){
            traverse(root.left);
            System.out.println(root.val);
            traverse(root.right);
        }
    }
}
