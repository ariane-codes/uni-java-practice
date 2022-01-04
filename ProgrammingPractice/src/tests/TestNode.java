package tests;

import exercises.trees.*;

public class TestNode {

    private Node<String> node;

    public TestNode() {
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);

        node = nodeA;
    }

    public static void main (String[] args) {
        TestNode test =  new TestNode();

        System.out.println("Hi");
    }
}

