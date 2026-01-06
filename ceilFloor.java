public class ceilFloor {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 35;

        int floor = -1;
        int ceil = -1;

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } 
            else if (arr[mid] < key) {
                floor = arr[mid];
                start = mid + 1;
            } 
            else {
                ceil = arr[mid];
                end = mid - 1;
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}
