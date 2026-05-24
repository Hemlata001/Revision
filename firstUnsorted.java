// find first unsorted element in an array
import java.util.*;

public class Main {

    public static void firstUnsorted(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {

                System.out.println("First unsorted element: " + arr[i + 1]);
                return;
            }
        }

        System.out.println("Array is sorted");
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5, 6};

        firstUnsorted(arr);
    }
}
