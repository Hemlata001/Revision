import java.util.*;

public class Main {

    public static void bubbleSort(int[] arr){

        for(int turn = 0; turn < arr.length - 1; turn++){

            boolean swapped = false; // ⭐ best case flag

            for(int j = 0; j < arr.length - 1 - turn; j++){

                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // swap hua
                }
            }

            // agar ek bhi swap nahi hua → already sorted
            if(!swapped){
                break;
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Before BubbleSort : ");
        printArr(arr);

        bubbleSort(arr);

        System.out.println("After BubbleSort : ");
        printArr(arr);
    }
}
// Time complexity - o(n)
