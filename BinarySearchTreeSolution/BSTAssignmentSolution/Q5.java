package BinarySearchtree;
import BinarySearchtree.implementation.BinarySearchTree;
import BinarySearchtree.implementation.Node;

public class Q5 {
        
           public static void main(String[] args) {
                    int[] values = {15, 10, 20, 8, 12, 16, 25};
                        int p = 6;
                        int q = 12;                    
                    Node root = null;

                    BinarySearchTree bst = new BinarySearchTree();
                    for(int i =0; i<values.length; i++) {
                                
                              root = bst.buildBst(root, values[i]);
                    } 

                    System.out.println("Lowest Common Ancestor (" + p + "," + q + "): " + lowestCommonAncestor(root, p, q).data );
                    
                    
           }

   public static Node lowestCommonAncestor(Node root, int p, int q) {
        
            if(p > root.data && q > root.data)
            return lowestCommonAncestor(root.right, p, q);


         else if(p < root.data && q < root.data)
             return lowestCommonAncestor(root.left, p, q);

     
        return root;


    }
}
