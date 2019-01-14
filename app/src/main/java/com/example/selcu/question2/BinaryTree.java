package com.example.selcu.question2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class BinaryTree {
    private Node root;
    private List<Node> nodeList;
    public  BinaryTree(List<Node> nodeList) {
        this.nodeList=nodeList;
        if(nodeList.size()>0){
            this.root=nodeList.get(0);
        }
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void createBinaryTree()
    {
        Node temp=null;
        Node current;
        current=root;
        nodeList.remove(0);
        for(Node n: nodeList)
        {
            if (current.getLeft()==null && current.getRight()==null)
            {
                Random random=new Random();
                int a=random.nextInt();
                if(a%2==0)
                {
                    current.setLeft(n);
                    temp=current.getLeft();
                }
                else
                {
                    current.setRight(n);
                    temp=current.getRight();
                }
            }
            else if (current.getLeft()==null){
                current.setLeft(n);
                temp=current.getLeft();
            }
            else if (current.getRight()==null){
                current.setRight(n);
                temp=current.getRight();
            }
            else if (nodeList.indexOf(n)%2==0){
                temp=current.getLeft();
            }
            else if (nodeList.indexOf(n)%2==1)
            {
                temp=current.getRight();
            }
            current=temp;
        }
    }
    @Override
    public String toString() {
        System.out.println(root.toString());
        return root.toString();
    }
    public boolean preorder(Node root)
    {
        // root,left,right
        Stack<Node> stack = new Stack<>();
            ArrayList arrayList =new ArrayList();
            if(root != null) {
                stack.push(root);
            }
            while (!stack.isEmpty()) {
                Node temp = stack.pop();
                if(arrayList.contains(temp)){
                    return true;
                }else {
                    arrayList.add(temp);
                }
                if(temp.getRight() != null) {
                    stack.push(temp.getRight());
                }
                if(temp.getLeft() != null) {
                    stack.push(temp.getLeft());
                }
            }
       return false;
    }
}
