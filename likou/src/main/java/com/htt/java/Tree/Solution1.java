package com.htt.java.Tree;


import java.util.LinkedList;

public class Solution1 {
    // 104. 二叉树的最大深度， 求树的根节点
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // 100. 相同的树 ， 判断两棵树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    // 226. 翻转二叉树
    // 你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
    // 以下是广度优先遍历（层序遍历）
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            //每次都从队列中拿一个节点，并交换这个节点的左右子树
            TreeNode tempNode = queue.poll();

            TreeNode left = tempNode.left;
            tempNode.left = tempNode.right;
            tempNode.right = left;

            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);
        }
        return root;
    }
    //深度优先遍历（递归）
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) {
    //         return null;
    //     }
    //     // 交换此节点的左右节点
    //     TreeNode tempNode = root.left;
    //     root.left = root.right;
    //     root.right = tempNode;
    //     // 向下递归
    //     invertTree(root.left);
    //     invertTree(root.right);

    //     return root;
    // }


    // 101. 对称二叉树
    // 给你一个二叉树的根节点 root ， 检查它是否轴对称。
    LinkedList<TreeNode> queue = new LinkedList<>();
    public boolean isSymmetric(TreeNode root) {
        TreeNode rightTree = invertTree(root.right);
        return false;
    }
}


