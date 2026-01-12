import java.util.*;
public class Main
{
    public static int findWoodCount(int[] heights ,int mid){
        int wood_count = 0;
        for(int i = 0;i<heights.length;i++){
            if(heights[i]>mid){
                wood_count = wood_count + (heights[i] - mid);
            }
        }
        return wood_count;
    }
    public static int machineHeights(int[] heights, int b){
        int maxi  = Integer.MIN_VALUE;
        for(int h = 0;h<heights.length;h++){
            if(heights[h]>maxi){
                maxi = heights[h];
            }
        }
        int start = 0;
        int end = maxi;
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            int wood_count = findWoodCount(heights , mid);
            
            if(wood_count == b || start ==  mid){
                return mid;
            }
            else if(wood_count>b){
                start  = mid;
            }else{
                end = mid;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] heights = {20,15,10,17};
		int b = 8;
		System.out.println(machineHeights(heights,b));
	}

  // Time complexity - O(log n)
}
