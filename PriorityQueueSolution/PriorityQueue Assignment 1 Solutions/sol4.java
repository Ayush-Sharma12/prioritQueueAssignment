package Heap.Assignment1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class sol4 {
             

           public static void main(String[] args) {
                    
                       int[] stones = {2,7,4,1,8,1};
                       
                       int ans = lastStoneWeight(stones);
                       System.out.println("Weight: " + ans);
           } 

      public  static int lastStoneWeight(int[] stones) {
        
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int data : stones)
        {
              q.offer(data);
        }


        while(q.size() > 1)
        {
              int x = q.poll();
              int y = q.poll();

              if(x != y) q.add(x - y); 
              
        }
          
        if(!q.isEmpty()) return q.peek();
        else return 0;


    }
}
