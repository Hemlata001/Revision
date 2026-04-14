import java.util.*;

public class Main {

    static String getReversed(String str){

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Babbar";

        String reversed = getReversed(str);
        System.out.println("Reversed of the String: " + reversed);
    }
}
