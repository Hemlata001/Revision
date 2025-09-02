class Solution {
    int maxSubArray(int[] nums) {   
        int n = nums.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
// tc = O(n)
// sc = O(1)
