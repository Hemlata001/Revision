import java.util.*;
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int end = arr.length-1;
        int start = 0;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
    }
}
