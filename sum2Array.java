// Sum of Two Arrays
import java.util.*;

public class sum2Array {
    public static void main(String[] args) {

        int[] arr1 = {3, 1, 0, 7, 5};
        int[] arr2 = {1, 1, 1, 1, 1, 1};

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int[] sum = new int[Math.max(arr1.length, arr2.length) + 1];
        int k = sum.length - 1;

        int carry = 0;

        while (k >= 0) {
            int digitSum = carry;

            if (i >= 0) {
                digitSum += arr1[i];
                i--;
            }

            if (j >= 0) {
                digitSum += arr2[j];
                j--;
            }

            carry = digitSum / 10;
            sum[k] = digitSum % 10;
            k--;
        }

        // Print result (skip leading zero)
        int idx = 0;
        if (sum[0] == 0) {
            idx = 1;
        }

        System.out.println("Sum Array:");
        for (; idx < sum.length; idx++) {
            System.out.print(sum[idx] + " ");
        }
    }
}
