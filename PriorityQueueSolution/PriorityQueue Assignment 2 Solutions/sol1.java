package Heap.Assignment2;
import java.util.*;

import sharma.revision1;
public class sol1 {
            
                public static void main(String[] args) {
                     String s = "";
                     
                     System.out.println("New String: " + reorganizeString(s));
                        
                } 

                public static String reorganizeString(String s) {
         
                    Map<Character, Integer> map = new HashMap<>();
           
                    for(char data : s.toCharArray())
                    {
                            map.put(data, map.getOrDefault(data, 0) + 1);
                    }
           
                    Queue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
                   
                       for(char data : map.keySet())
                       {
                              maxHeap.add(data);
                       }
                          
           
                    StringBuilder sb = new StringBuilder();  
                    while(maxHeap.size() >= 2)
                    {
                          char ch1 = maxHeap.poll();
                          char ch2 = maxHeap.poll();
                          sb.append(ch1);
                          sb.append(ch2);
           
                          map.put(ch1, map.get(ch1) - 1);
                          map.put(ch2, map.get(ch2) - 1);
           
                          if(map.get(ch1) > 0) maxHeap.add(ch1);
           
                          if(map.get(ch2) > 0) maxHeap.add(ch2);
           
           
           
           
                    }
           
                    while(!maxHeap.isEmpty())
                    {
                          char ch = maxHeap.poll();
           
                          if(map.get(ch) > 1) return "";
           
                          sb.append(ch);
                    }
           
            
                     return sb.toString();
               }  
               
}
