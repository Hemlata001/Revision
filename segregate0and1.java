// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            while(arr[start] == 0 && start<end){
                start++;
            }
            while(arr[end] == 1 && start<end){
                end--;
            }
            
            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
