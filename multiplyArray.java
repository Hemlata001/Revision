// Multiply each element of array by 10
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int mult = 10;
        for(int i = 0;i<arr.length;i++){
            arr[i] = mult*arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
