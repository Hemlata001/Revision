// Find the average of array elements.
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        int size = arr.length;
        System.out.println(sum);
        int avg = sum / size;
        System.out.println(avg);
    }
}
