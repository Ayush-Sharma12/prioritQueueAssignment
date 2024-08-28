package Heap.Assignment1;

import java.util.PriorityQueue;
import java.util.Queue;

public class sol1 {
             
           public static void main(String[] args) {
                       
                  int[] nums = {1,2,3,5,2,6,9}; 
                  int k = 3;

                  int res =  findKthLargest(nums, k);
                  
                  System.out.println("Kth largest: " + res);
                    
                      
           }


            public static int findKthLargest(int[] nums, int k) {
                    Queue<Integer> pq = new PriorityQueue<>();
    
         for(int i : nums) {
              
               pq.add(i);
               if(pq.size() > k) pq.poll(); 
         }


         return pq.poll();


       

    }
}
