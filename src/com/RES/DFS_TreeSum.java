package com.RES;

public class DFS_TreeSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        System.out.println("Tree has path: " + TreePathSum.hasPath(root, 19));
        System.out.println("Tree has path: " + TreePathSum.hasPath(root, 5));

    }
}

    class TreePathSum {
        public static boolean hasPath(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            if (root.val == sum && root.left == null && root.right == null) {
                return true;
            }
            return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);

        }
    }
