
public class Main
{
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		System.out.println("Before Selection Sort");
		int[] arr = {5,4,2,1,3,6};
		printArr(arr);
		System.out.println("After Selection Sort");
		selectionSort(arr);
		printArr(arr);
	}
}
