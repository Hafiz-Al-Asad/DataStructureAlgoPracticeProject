package com.company.hafiz;

import java.util.List;
import java.util.ArrayList;

public class Search {


    public boolean binarySearch(List<Integer> myList,int valueToBeSearched ){

       int listSize = myList.size();
       int middlePoint = 0;
       int lowerPoint = 0;
       int upperPoint = listSize-1;

       while(lowerPoint <= upperPoint){
           middlePoint =  (lowerPoint + upperPoint)/2;
           System.out.println("Middle point =>"+ middlePoint +"Middlepoint value => "+ myList.get(middlePoint) );

           if(valueToBeSearched == myList.get(middlePoint))
               break;
           else if(valueToBeSearched> myList.get(middlePoint)){
               lowerPoint = middlePoint + 1;
           }
           else if (valueToBeSearched < myList.get(middlePoint)){
                upperPoint = middlePoint -1;
           }

       }
       if(lowerPoint>upperPoint){
           System.out.println("Number not found");
           return false;
       }

       else{
           System.out.println("Number found - Index"+ middlePoint);
           return true;
       }

    }


}
