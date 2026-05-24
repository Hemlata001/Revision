// shift array element by 1 position
import java.util.*;

public class Main {

    public static void shiftBy1(int[] arr) {
        int n = arr.length;
        
        //step 1 - store last wale ki value
        int temp = arr[n-1];
        
        // step 2 - shift all values of array 
        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        
        // step 3 - temp ki value ko 0 index pr copy
        arr[0] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        shiftBy1(arr);
        
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
