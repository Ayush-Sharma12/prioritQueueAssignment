package BinarySearchtree;

import BinarySearchtree.implementation.*;
import BinarySearchtree.implementation.BinarySearchTree;
import BinarySearchtree.implementation.Node;
import java.util.*;
public class Q1 {
           
          
            public static void main(String[] args) {
                    
                    int[] values = {15, 10, 20, 8, 12, 16, 25};
                    int val = 25;
                    
                    Node root = null;

                    BinarySearchTree bst = new BinarySearchTree();
                    for(int i =0; i<values.length; i++) {
                                
                              root = bst.buildBst(root, values[i]);
                    }

                    int res = search(root, val);
                    
                    if(res == -1) System.out.println("Element can't present in BST");
                    else{
                                System.out.println("The given key is the right node of the node with key: " + res);
                    }
                       
            }

           static  int search(Node root, int val) {
                      
                    List<Integer> bst = new ArrayList<>();  
                    inorder(root, bst);

                    for(int i =0; i<bst.size(); i++) {
                             
                              if(bst.get(i) == val) { 
                                         return bst.get(i-1);
                              }
                    }

                    return -1;
            }

            static void inorder(Node root, List<Integer> bst) {
                      
                      if(root == null) return;

                      inorder(root.left, bst);
                      bst.add(root.data);
                      inorder(root.right, bst);


            }
}
