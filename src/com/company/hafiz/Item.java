package com.company.hafiz;
import java.util.ArrayList;
import java.util.List;
public class Item {


    private List<String> data=new ArrayList<String>();

    //stack portion
    private int top;
    public int getTop(){
        return top;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void incrementTop(){
        top = top+1;
    }
    public void decrementTop(){ top = top-1; }

    //queue portion
    ///private int head;
    private int tail;
//    public void setHead(int head){
//        this.head = head;
//    }
//    public int getHead(){
//        return head;
//    }
    public void setTail(int tail){
        this.tail = tail;
    }
    public int getTail(){
        return tail;
    }
//    public void incrementHead(){
//        head = head+1;
//    }
//    public void decrementHead(){ tail = tail-1; }

    public void incrementTail(){
        tail = tail+1;
    }
    public void decrementTail(){ tail = tail-1; }

    //general part
    public List<String> getData(){
        return data;
    }
    public void setData(List<String> data){
        this.data = data;
    }


}
