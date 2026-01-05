// Inverse of an Array
import java.util.*;

public class InverseArray {

    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            inv[arr[i]] = i;
        }

        return inv;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 3};

        int[] result = inverse(arr);

        System.out.println("Inverse Array: " + Arrays.toString(result));
    }
}
