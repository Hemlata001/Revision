
class Solution {
  
    // Function to rotate an array by d elements in counter-clockwise direction.
  
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d % n;
       
        // step 1 - reverse an array at d
        reverse(arr,0,d-1);
        // step 2 - reverse an array at n-1
        reverse(arr,d,n-1);
       // step 3 - reverse an array
        reverse(arr,0,n-1);
        
    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
