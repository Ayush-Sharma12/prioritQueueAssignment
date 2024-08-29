package BinarySearchtree;

import BinarySearchtree.implementation.BinarySearchTree;
import BinarySearchtree.implementation.Node;
import java.util.*;

public class Q4 {
            

           public static void main(String[] args) {
                  
                    int[] values = {15, 10, 20, 8, 12, 16, 25};
                    int k = 2;
                    
                    Node root = null;
          
                    BinarySearchTree bst = new BinarySearchTree();
                    for(int i =0; i<values.length; i++) {
                                
                              root = bst.buildBst(root, values[i]);
                    }    

                    Solution sol = new Solution();
                    sol.getPredecessor(root);  
                      
           }


}

class Solution{
            
           void inorder(Node root, List<Integer> list) {
                     
                      if(root == null) return;

                      inorder(root.left, list);
                      list.add(root.data);
                      inorder(root.right, list);
           } 
           void getPredecessor(Node root) {
                    Map<Integer, Integer> map = new HashMap<>();   
                    List<Integer> list = new ArrayList<>();
                    inorder(root, list);
                    map.put(list.get(0), -1);
                    for(int i = 1; i<list.size(); i++) {
                                
                               map.put(list.get(i), list.get(i-1));
                    }

                    Queue<Node> q = new LinkedList<>();
                    q.add(root);

                    while(!q.isEmpty()) {
                            
                            Node x = q.poll();
                            
                                   
                                    if(map.get(x.data) == -1) {
                                         System.out.println("The predecessor doesn't exist for node: " + x.data);
                                    } 
                                    else{
                                          System.out.println("The predecessor of node " + x.data + " is: " + map.get(x.data));
                                    }
                                  
                              if(x.left != null) {
                                          q.add(x.left);
                              }
                              if(x.right != null) {
                                         q.add(x.right);
                              }


                                
                    }
           }
}