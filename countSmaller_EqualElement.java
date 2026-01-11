
public class Main
{
    public static int binary(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int countSmaller_EqualElement(int[] arr,int key){
        int r = binary(arr,key);
        return r+1;
    }
    
	public static void main(String[] args) {
		int[] arr = {2,6,12,18,21,26,33,42};
		int s = countSmaller_EqualElement(arr,33);
		System.out.println(s);
		
	}
}
