/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heaps;

/**
 *
 * @author Kunwar
 */
class MinHeap{
    int capacity;
    int harr[];
    int heap_size;
    
    MinHeap(int capacity){
        this.capacity = capacity;
        harr = new int[capacity];
        heap_size = 0;
    }
    
    private int parent(int i){
        return i/2;
    }
    
    private int left(int i){
        return 2*i+1;
    }
    
    private int right(int i){
        return 2*i+2;
    }
    
    private void insertKey(int k){
        if(heap_size == capacity){
            System.out.println("OverFlow");
            return;
        }
        heap_size++;
        int i = heap_size-1;
        harr[i] = k;
        
        while(i!=0 && harr[i] < harr[parent(i)]){
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }
    
    private void decreaseKey(int i, int new_val){
        harr[i] = new_val;
        int j=i;
        while(i!=0 && harr[i] < harr[parent(i)] ){
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
        minHeapify(0);
    }
    
    private int getMin(){
        return harr[0];
    }
    
    private void minHeapify(int i){
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if( l < heap_size && harr[l] < harr[i])
            smallest = l;
        if( r < heap_size && harr[r] < harr[i])
            smallest = r;
        if(smallest != i){
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            minHeapify(smallest);
        }
    }
    
    private int extractMin(){
        if(heap_size <= 0)
            return Integer.MAX_VALUE;
        if(heap_size == 1){
            heap_size--;
            return harr[0];
        }
        int root = harr[0];
        harr[0] = harr[heap_size-1];
        heap_size--;
        minHeapify(0);
        return root;
    }
    
    private void deleteKey(int y){
        decreaseKey(y, Integer.MIN_VALUE);
        extractMin();
        
    }
    
    public static void main(String[] args)
    {
        MinHeap h = new MinHeap(11);
        h.insertKey(3);
        h.insertKey(2);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.deleteKey(1);
        h.insertKey(45);
        System.out.println(h.extractMin());
        System.out.println(h.getMin());
        h.decreaseKey(2, 1);
        System.out.println(h.getMin());
        for(int i:h.harr)
            System.out.print(i+" ");
    }
    
}


public class MinHeaps
{
    
}
