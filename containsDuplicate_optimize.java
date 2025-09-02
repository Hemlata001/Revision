import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Traverse pura array
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false; // koi duplicate nahi mila
    }
}
// tc = O(nlogn)
// sc = O(1)
