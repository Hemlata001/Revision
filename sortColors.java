// Dutch National Flag Algorithm
class Solution {
    private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            // case 1
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
  // TC = O(N)
  // Sc  = O(1)
}
