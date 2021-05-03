package com.company.hafiz;


public class LinkedList {


    private Node root;
    private Node currentNode;

 public void insertNode(int data){
    if(root == null){
        root = new Node();
        root.data = data;
        root.next = null;
        currentNode = root;
    }
    else{
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        currentNode.next = newNode;
        currentNode = newNode;
    }

 }

 public void deleteNode(int data){
     Node nodeTobeDeleted = root;
     Node previousNode = null;
     while(nodeTobeDeleted.data != data){
         previousNode = nodeTobeDeleted;
         nodeTobeDeleted = nodeTobeDeleted.next;
     }
     System.out.println("Root ->" + root.data);
     System.out.println("Nodes to be delted =>" + nodeTobeDeleted.data);
     if(nodeTobeDeleted == root){
         Node temp = root;
         root = root.next; // root er porer node tai ekhon root hoye jabe
         temp = null;
     }
     else{
         previousNode.next = nodeTobeDeleted.next;
         nodeTobeDeleted = null;
     }


 }


 public void printNode(){
     Node instantNode = root;

     while(instantNode!= null){
         System.out.println("Data -> "+ instantNode.data);
         instantNode = instantNode.next;
     }

 }



}
