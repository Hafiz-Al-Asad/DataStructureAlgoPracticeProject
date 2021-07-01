package com.company.hafiz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main main = new Main();

       //main.stackCall();
       //main.queueCall();
       // main.primeCheck();
       // main.binarySearch();
       // main.linkedList();
        //main.maxHeapCheck();

    }

    private void maxHeapCheck(){
        Tree tree = new Tree();
        int heap[] = new int[10];
        heap[1]= 19;
        heap[2]= 7;
        heap[3]= 9;
        heap[4]= 3;
        heap[5]= 5;
        heap[6]= 12;
        heap[7]= 10;
        heap[8]= 1;
        heap[9]= 2;
        tree.maxHeapify(heap,9,3);
        tree.printHeap(heap,9);

//        int isMaxHeap = tree.isMaxHeap(heap,9);
//        if(isMaxHeap == 1)
//            System.out.println("Max heap it is");
//        else
//            System.out.println("This is not max heap");

    }



    private void linkedList(){
        LinkedList link = new LinkedList();
        link.insertNode(1);
        link.insertNode(2);
        link.insertNode(3);
        link.insertNode(4);
        //link.printNode();
        link.deleteNode(3);
        link.printNode();
    }

    private void binarySearch(){
        Search s = new Search();
        List<Integer> myList  = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        myList.add(11);
        myList.add(12);
        myList.add(13);
        s.binarySearch(myList,11);
    }


    private void primeCheck(){
        Sieve.isPrime(40);
        Sieve.isPrime(2);
        Sieve.isPrime(1);
        Sieve.isPrime(7);
        Sieve.isPrime(0);
        Sieve.isPrime(29);
    }

    private void stackCall(){
        Stack myStack = new Stack();

        myStack.push("a");
        myStack.push("bc");
        myStack.push("def");
        myStack.push("ghij");
        myStack.push("klmnop");
        myStack.pop();
        myStack.pop();
        myStack.push("qrste");
        myStack.push("uilkksl");
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        myStack.stackPrint();
    }

    private void queueCall(){
        System.out.println("Queue print");
        Queue myQueue = new Queue();
        myQueue.queuePrint();
        myQueue.enQueue("a");
        myQueue.enQueue("bc");
        myQueue.enQueue("def");
        myQueue.enQueue("ghij");
        myQueue.enQueue("klmnop");
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue("qrste");
        myQueue.enQueue("uilkksl");
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue("a");
        myQueue.enQueue("bc");
        myQueue.enQueue("def");
        myQueue.enQueue("ghij");
        myQueue.enQueue("klmnop");
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();

        myQueue.queuePrint();
    }


}
