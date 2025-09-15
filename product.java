
public class Main
{
   
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {2,1,3,4,5};
		int product = 1;
        for(int i = 0;i<arr.length;i++){
            product *= arr[i];
        }
		System.out.println(product);
	}
}
