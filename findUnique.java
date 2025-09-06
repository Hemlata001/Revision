import java.util.*;
public class Main
{
    static int findUnique(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
   
	public static void main(String[] args) {
	    int[] arr = {1,2,3,3,3,2};
	    System.out.println("Find the unique number : "+ findUnique(arr));

	}
}
