package com.company.hafiz;

public class Tree {

    private int heap[] = new int[10];


    private int leftNodeIndexForMaxHeap(int i){
        return 2*i;
    }
    private int rightNodeIndexForMaxHeap(int i){
        return 2*i +1;
    }
    private int parentNodeIndexForMaxHeap(int i){
        return i/2;
    }

    public void printHeap(int heap[], int heapSize){
        for(int i=1;i<=heapSize;i++){
            System.out.println(" "+ heap[i]);
        }

    }

    public void maxHeapify(int heap[],int heapSize,int nodeIndex){
        this.heap = heap;
        int left,right,largest,temp;
        left = leftNodeIndexForMaxHeap(nodeIndex);
        right = rightNodeIndexForMaxHeap(nodeIndex);
        if(left<= heapSize && heap[left]> heap[nodeIndex])
            largest = left;
        else
            largest = nodeIndex;
        System.out.println("Largest - "+largest);
        if(right<= heapSize && heap[right]> heap[nodeIndex])
            largest = right;

        System.out.println("Largest - "+largest);

        if(largest!=nodeIndex){
            System.out.println("Largest node -"+largest+" value -" + heap[largest]);
            temp = heap[nodeIndex];
            heap[nodeIndex] = heap[largest];
            heap[largest] = temp;
            maxHeapify(heap,heapSize,largest); // ekhane largest er value define korteche maxheap kore kon index  e achi sheta
        }

    }


    public int isMaxHeap(int heap[],int heapSize){
        int i,p;

        for(i=heapSize; i>1; i--){
            p = parentNodeIndexForMaxHeap(i);
            System.out.println("I = "+i+", p = "+p+"\theap[i] "+heap[i]+", heap[p] "+heap[p]);
            if(heap[p] < heap[i]) //if Parent node is less then child node,
                return 0;  // we should break the loop as it's not maxHeap
        }
        return 1;
    }

}
