package Heap.Assignment1;

import java.util.PriorityQueue;
import java.util.Queue;

public class sol2 {
          
          public static void main(String[] args) {
          
                  
                    int[] nums = {5, 4, 2, 8}; 
                   int x =  minimizeCost(nums);
                   System.out.println("Minimum cost: " + x);
                }

            public static int minimizeCost(int[] nums)
              {
                      Queue<Integer> q = new PriorityQueue<>();

                      for(int data : nums)
                             q.offer(data);

                      int sum = 0;
                      while(q.size() > 2)
                      {
                                int r1 = q.poll();
                                int r2 = q.poll();
                                
                                int res = r1 + r2;
                                q.add(res);
                                sum += res;
                        
                      }  
                      
                      
                      return sum + q.poll() + q.poll();


           }
}
