import java.util.*;
public class Main
{
    static int repeatingNumber(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] ==  arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
        
    }
   
	public static void main(String[] args) {
	    int[] arr = {1,2,13,5,7,10,1};
	    System.out.println("Repeating Number : " +repeatingNumber(arr));

	}
}
