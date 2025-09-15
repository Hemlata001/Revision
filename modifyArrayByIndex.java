
public class Main
{
    public static void modifyIndex(int[] arr){
        for(int i = 0;i<arr.length;i++){
            // condition
            if(i%2 == 0){
                arr[i] = arr[i]+10; // even
            }else{
                arr[i] = arr[i]*2; // odd
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {2,1,3,4,5};
		modifyIndex(arr);
		for(int i = 0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
