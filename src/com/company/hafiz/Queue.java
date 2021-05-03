package com.company.hafiz;

import java.util.List;

public class Queue {

    private int stackMax = 5;
    Item item;
    public Queue(){
        item = new Item();
        //item.setHead(0);
        item.setTail(0);
    }


    public void enQueue(String itemToPush){

        if(item.getTail()<stackMax){
            List<String> itemList = item.getData();
            itemList.add(itemToPush);
            item.incrementTail();
            item.setData(itemList);
        }
        else
            System.out.println("Queue is full");

    }

    public String deQueue(){
        if(item.getTail()==0){
            System.out.println("Queue is empty");
            return "Queue is empty";
        }
        else{
            List<String> itemList = item.getData();
            String itemToDequeue = itemList.get(0);
            itemList.remove(0);
            item.decrementTail();
            System.out.println("Popped - "+ itemToDequeue);
            return itemToDequeue;
        }

    }

    public void queuePrint(){
        for(String checkItem : item.getData()){
            System.out.println(checkItem);
        }
    }

}
