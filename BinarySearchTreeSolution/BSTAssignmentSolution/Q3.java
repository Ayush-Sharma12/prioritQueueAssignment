package BinarySearchtree;

import BinarySearchtree.implementation.*;
import BinarySearchtree.implementation.BinarySearchTree;
import BinarySearchtree.implementation.Node;
import java.util.*;
public class Q3 {
           
         public static int[] pair(Node root, int sum)
         {
                 Map<Integer, Integer> pair = find(root);
                  
                  int[] res = new int[2]; 
                 for (Map.Entry<Integer, Integer> en : pair.entrySet()) {
                         if(pair.containsKey(sum - en.getKey()))
                          {
                                  res[0] = en.getKey();
                                  res[1] = sum - en.getKey();
                                 
                          }
                       
                     
                 }
                 

                   
                  
                   
                  
                  return res;
         }

        static HashMap<Integer, Integer>  hmap = new HashMap<>();        
          public static Map<Integer, Integer> find(Node root)
         {
                    
                if(root == null)
                     return hmap;
                     
                find(root.left);
                hmap.put(root.data, 0);
                find(root.right);


                return hmap;
                  
              
            
         }


           
           public static void main(String[] args) {
                    

                    int[] values = {15, 10, 20, 8, 12, 20, 30, 6, 9, 18, 22};
 
                     BinarySearchTree bst = new BinarySearchTree(); 
                    Node root = null;
                    for(int i=0; i<values.length; i++)
                           root = bst.buildBst(root, values[i]);
                   
                   int pair = 14;
                  System.out.println("Pair of " + pair + " is: " + Arrays.toString(pair(root, pair)));
                      
           }
}
