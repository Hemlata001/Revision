class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[2];
        int max = grid.length* grid.length;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                int val = grid[i][j];
                if(set.contains(val)){
                    arr[0] = val;
                }
                set.add(val);
            }
        }
        for(int i = 1;i<=max;i++){
            if(!set.contains(i)){
                arr[1] = i;
            }
        }
        return arr;
        
    }
}
