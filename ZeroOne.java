import java.util.*;
public class Main
{
    public static  void ZeroOne(int[] arr){
        int countZero = 0;
		int countOne = 0;
		for(int i = 0;i<arr.length;i++){
		    if(arr[i] == 1){
		        countOne++;
		    }else{
		        countZero++;
		    }
		}
		System.out.println("Count the number of Zeros : "+ countZero);
		System.out.println("Count the number of Ones : "+ countOne);
    }
	public static void main(String[] args) {
		int[] arr = {1,0,0,1,0,1,1};
		ZeroOne(arr);
		
	}
}
