package Heap.Assignment2;
import java.util.*;
public class sol2 {
            
          public static void main(String[] args) {
                    int[] nums1 = {1, 1, 2};
                    int[] nums2 = {1, 2, 3};
                    int k = 2;
            
                    Queue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            int a = o1[0] + o1[1];
                            int b = o2[0] + o2[1];
                            return Integer.compare(a, b);
                        }
                    });
            
                    // Initialize the heap with the first element of nums1 and every element of nums2
                    for (int j = 0; j < Math.min(k, nums2.length); j++) {
                        minHeap.add(new int[]{nums1[0], nums2[j], 0});
                    }
            
                    List<List<Integer>> list = new ArrayList<>();
                    while (k-- > 0 && !minHeap.isEmpty()) {
                        int[] current = minHeap.poll();
                        list.add(Arrays.asList(current[0], current[1]));
                        int i = current[2];
                        if (i + 1 < nums1.length) {
                            minHeap.add(new int[]{nums1[i + 1], current[1], i + 1});
                        }
                        
                    }
            
                    System.out.println(list);
                }
}
