public class Main
{
    public static int countSmaller_EqualElement(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = (start + end)/2;
            if(arr[mid] == key){
                while(mid+1<arr.length && arr[mid+1] == key){
                    mid++;
                }
                break;
            }else if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return mid+1;
    }
    
    
	public static void main(String[] args) {
		int[] arr = {2,6,12,18,21,26,26,26};
		System.out.println(countSmaller_EqualElement(arr,26));
		
	}
}
