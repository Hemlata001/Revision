public class Main {

    public static boolean binarySearch(int[][] matrix, int key) {

        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } 
            else if (matrix[row][col] < key) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        binarySearch(matrix, 11);
    }
}
