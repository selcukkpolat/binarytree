package com.example.selcu.question2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node k= new Node(2);
        Node l= new Node(4);
        Node m= new Node(5);
        Node n= new Node(2);
        List<Node> a=new ArrayList<Node>();
        a.add(k);
        a.add(n);
        a.add(m);
        a.add(k);
        BinaryTree binaryTree=new BinaryTree(a);
        binaryTree.createBinaryTree();
        boolean result = binaryTree.preorder(binaryTree.getRoot());
         binaryTree.toString();
        System.out.println(result);

    }
}
