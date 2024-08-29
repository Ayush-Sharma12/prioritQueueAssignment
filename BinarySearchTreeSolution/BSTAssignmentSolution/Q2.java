package BinarySearchtree;
import BinarySearchtree.implementation.BinarySearchTree;
import BinarySearchtree.implementation.Node;
import java.util.*;

public class Q2 {
 
  public static void inorder(Node root, List<Integer> list)
  {
        if(root == null)
           return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);

       
  }

    public static int kthSmallest(Node root, int k) {
          
          List<Integer> res = new ArrayList<>();
         inorder(root, res);
       
       return res.get(res.size() - k);

    } 

     public static void main(String[] args) {
          int[] values = {15, 10, 20, 8, 12, 16, 25};
          int k = 2;
          
          Node root = null;

          BinarySearchTree bst = new BinarySearchTree();
          for(int i =0; i<values.length; i++) {
                      
                    root = bst.buildBst(root, values[i]);
          }

          int ans = kthSmallest(root, k);
          System.out.println("the k'th largest node is: " + ans);
     }
}
