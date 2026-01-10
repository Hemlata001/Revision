public class Main {

    public static int binarySearchDescending(int[] ar, int key) {
        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ar[mid] == key) {
                return mid;
            } 
            else if (key < ar[mid]) {
                start = mid + 1;   // right side
            } 
            else {
                end = mid - 1;     // left side
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {92, 88, 72, 61, 56, 23, 19};
        int r = binarySearchDescending(ar, 61);
        System.out.println(r);
    }
}
