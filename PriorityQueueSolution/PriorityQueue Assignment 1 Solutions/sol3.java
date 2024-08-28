package Heap.Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class sol3 {
             

             public static void main(String[] args) {
                       
                        String[] words = {"i","love","leetcode","i","love","coding"};
                        int k = 2;

                        List<String> ans =   topKFrequent(words, k);
                        System.out.println("Top-K: " + ans);

                        
                       
             }  

      public static List<String> topKFrequent(String[] words, int k) {

      Map<String, Integer> map = new HashMap<>();

      for(String data : words)
      {
           map.put(data, map.getOrDefault(data, 0) + 1);
      }

      Queue<Map.Entry<String, Integer>> Heap = new PriorityQueue<>((a, b) -> 
      {         
           if(a.getValue() == b.getValue()) return a.getKey().compareTo(b.getKey());
           
           else return  b.getValue() - a.getValue();
       
      });

    
       Heap.addAll(map.entrySet());
   
       List<String> result = new ArrayList<>();

       while(k-- > 0) 
       {
            result.add(Heap.poll().getKey());
       }
      
      return result;
    }
}
