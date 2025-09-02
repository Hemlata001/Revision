// BruteForce Approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Traverse pura array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // duplicate mil gaya
                }
            }
        }
        return false; // koi duplicate nahi mila
    }
}
tc = 0(n^2)
sc = O(1)
