// User function Template for Java
import java.util.*;
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        // maxheap
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0;i<arr.length;i++){
            pq.add(arr[i]);
            
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    
    }
}

// TC = O(N)

// SC = O(N)
