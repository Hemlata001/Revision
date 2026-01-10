public class Main
{
    public static int ascendingBinary(int[] arr, int key, int range){
        int start = 0;
        //int end = arr.length-1;
        int end = range;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key<arr[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public static int descendingBinary(int[] arr, int key,int range){
        //int start = 0;
        int start = range;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key<arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static int findBitonicPoint(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = (start + end)/2;
            if(arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
    
    public static int searchBitonic(int[] arr, int key, int bIndex){
        if(key == arr[bIndex]){
            return bIndex;
        }
        
        if(key>arr[bIndex]){
            return -1;
        }
        
        int res1 = ascendingBinary(arr,key,bIndex-1);
        if(res1 != -1){
            return res1;
        }
        
        int res2 = descendingBinary(arr,key,bIndex+1);
        if(res2 != -1){
            return res2;
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,10,3,2,1};
		int b = 8;
		int bIndex = findBitonicPoint(arr);
		System.out.println(searchBitonic(arr,b,bIndex));
	}
}
