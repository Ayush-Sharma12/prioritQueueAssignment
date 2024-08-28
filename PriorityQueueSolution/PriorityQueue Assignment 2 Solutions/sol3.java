package Heap.Assignment2;
import java.util.*;
public class sol3 {
            
             public static void main(String[] args) {
                      
                     int a = 2;
                     int b = 4;
                     int c = 6;

                     System.out.println("Max Score: " + maximumScore(a, b, c));
             }

             public static int maximumScore(int a, int b, int c) {
        
                 

                    Queue<Integer> pq = new PriorityQueue<>();
   
                    pq.add(a);
                    pq.add(b);
                    pq.add(c);
   
                    int x = pq.poll();
                    int y = pq.poll();
                    int z = pq.poll();                        
                      
                    if( z >= (x+y)) return x + y;
                     
                    return (x+y+z)/2;
                    
                      
              
       }
}
