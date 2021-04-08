package com.company.hafiz;


import java.util.ArrayList;
import java.util.List;

public class Stack {

    private int stackMax = 5;
    Item item;
    public Stack(){
        item = new Item();
        item.setTop(0);
    }

    public void push(String dataToPush){

            if(item.getTop()<stackMax){
               List<String> listData= item.getData();
               listData.add(dataToPush);
               item.setData(listData);
               item.incrementTop(); // increment kora lagteche stack full ache kina check korar jonno

            }
            else
                System.out.println("Stack is full");

    }

    public String pop(){

        if(item.getTop()== 0){
            System.out.println("Stack is empty !");
            return "Stack is Empty";
        }

        else
        {
            List<String> listData = item.getData();
            int top = listData.size() - 1;
            String itemToPop =  listData.get(top);
            listData.remove(top);
            item.decrementTop(); // decrement kora lagteche stack full ache kina check korar jonno
            System.out.println("Popped- "+itemToPop);
            return itemToPop;
        }
    }

    public void stackPrint(){
        for(String checkItem : item.getData()){
            System.out.println(checkItem);
        }
    }

}


