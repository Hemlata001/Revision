
public class Main
{
    static int sumArray(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
	public static void main(String[] args) {
	    int[] arr = {1,4,5};
		System.out.println("Sum of Array : " + sumArray(arr));
	}
}
