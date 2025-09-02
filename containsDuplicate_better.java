import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // duplicate mil gaya
            }
            set.add(num);
        }
        return false; // koi duplicate nahi mila
    }
}
// tc = O(n)
// sc = O(n)
