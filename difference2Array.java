// Difference of Two Arrays
import java.util.*;

public class diff2Array {
    public static void main(String[] args) {

        int[] arr1 = {3, 1, 0, 7, 5};
        int[] arr2 = {1, 1, 1, 1, 1, 1};

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int[] diff = new int[Math.max(arr1.length, arr2.length)];
        int k = diff.length - 1;

        int borrow = 0;

        while (k >= 0) {

            int digit = arr2[j] - borrow;

            if (i >= 0) {
                digit -= arr1[i];
                i--;
            }

            if (digit < 0) {
                digit += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            diff[k] = digit;
            j--;
            k--;
        }

        // Print result (skip leading zero)
        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        System.out.println("Difference Array:");
        for (; idx < diff.length; idx++) {
            System.out.print(diff[idx] + " ");
        }
    }
}
