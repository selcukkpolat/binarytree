package com.example.selcu.question2;

class Node {
    private int value;
    private Node right;
    private Node left;

    Node(int value) {
        this.setValue(value);
        setRight(null);
        setLeft(null);
    }

    public Node(int value, Node right, Node left) {
        this.setValue(value);
        this.setRight(right);
        this.setLeft(left);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        try {
            String result ="Node{" +
                    "value=" + value +
                    ", right=" + right +
                    ", left=" + left +
                    '}';
            //  System.out.println(result);
            return result;
        }catch (StackOverflowError e){
            return null;
        }

    }

    @Override
    public boolean equals(Object obj) {

        Node other = (Node) obj;
        if (other == null) {
            return false;
        }

        if (!(other instanceof Node)) {
            return false;
        }
        if (other == this) {
            return true;
        }

        if (this.value == other.getValue() &&
                this.left == null && other.getLeft() == null
                && this.right == null && other.getRight() == null) {
            return true;
        }

        if (this.value == other.getValue() && this.left != null &&
                this.left.equals(other.getLeft())
                && this.right == null && other.getRight() == null) {
            return true;
        }

        if (this.value == other.getValue() &&
                this.left == null && other.getLeft() == null
                && this.right != null && this.right.equals(other.getRight())) {
            return true;
        }

        if (this.value == other.getValue() &&
                this.left != null && this.left.equals(other.getLeft())
                && this.right != null && this.right.equals(other.getRight())) {
            return true;
        }

        return false;
    }
}


