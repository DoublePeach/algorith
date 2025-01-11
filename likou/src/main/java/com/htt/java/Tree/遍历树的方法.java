package com.htt.java.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class 遍历树的方法 {
    // 递归遍历
    public void preOrderRecur1(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");//如果是中序遍历,这行代码放在下行代码后面即可)
        preOrderRecur1(head.left);
        preOrderRecur1(head.right);
    }


    // 迭代遍历
    //前序遍历
    public void preOrderRecur2(TreeNode head) {
        if (head == null) {
            return;
        }
        Deque<TreeNode> Stack=new ArrayDeque<>();
        Stack.push(head);
        while(Stack!=null){
            head=Stack.pop();
            System.out.println(head.val);
            if(head.right!=null){
                Stack.push(head.right);// 步骤1  压入右边节点
            }
            if(head.left!=null){
                Stack.push(head.left);// 步骤2 压入左边的节点
            }
        }
    }

    // 中序遍历
    public void inOrder(TreeNode root){
        Deque<TreeNode> Stack=new ArrayDeque<>();
        while(!Stack.isEmpty()||root!=null){   //isEmpty()用来判断栈的元素是否为0;
            while(root!=null){
                Stack.push(root);
                root=root.left;
            }
            TreeNode temp=Stack.pop();
            System.out.println(temp.val);
            if(temp.right!=null){
                root=temp.right;
            }
        }
    }

    // 后序遍历
    public void inOrder2(TreeNode root){
        Deque<TreeNode> Stack1=new ArrayDeque<>();
        Deque<TreeNode> Stack2=new ArrayDeque<>();
        Stack1.push(root);
        while(!Stack1.isEmpty()||root!=null){
            root=Stack1.pop();
            Stack2.push(root);
            if(root.right!=null){
                Stack1.push(root.right);
            }
            if(root.left!=null){
                Stack1.push(root.left);
            }
        }
        while(!Stack2.isEmpty()){
            System.out.println(Stack2.pop().val);
        }
    }

    public static void leveOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.offer(head);
        while(!queue.isEmpty()){
            head=queue.poll();
            System.out.println(head.val);
            if(head.left!=null){
                queue.push(head.left);
            }
            if(head.right!=null){
                queue.push(head.right);
            }
        }
    }


}
