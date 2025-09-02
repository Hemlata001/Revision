// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int n = arr.length;
        
        for(int i = 0;i<n;i++){
            if(maxi<arr[i]){
                maxi = arr[i];
            }
        }
        for(int i = 0;i<n;i++){
            if(mini>arr[i]){
                mini = arr[i];
            }
        }
        return new Pair<>(mini, maxi);
    }
}
// geeks for geeks
