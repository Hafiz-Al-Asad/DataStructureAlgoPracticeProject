package com.company.hafiz;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

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
        //String itemToAdd;
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
