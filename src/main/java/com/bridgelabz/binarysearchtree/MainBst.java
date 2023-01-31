/* 2. Ability to create the binary tree shown in the figure
    *    Check if all are added with using size method in Binary Tree
      */
package com.bridgelabz.binarysearchtree;

public class MainBst {
    
    public static void main(String[] args) {
        System.out.println("welcome to BST program");
        BinaryTree bst = new BinaryTree();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70); // 30->56->70->80

        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);

    }

}