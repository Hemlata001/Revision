// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        
        // step 1 - convert string to array
        char[] chars = s.toCharArray(); 
        
        // step 2 -  reverse an array

        int start = 0;
        int end = chars.length-1;
        
        while(start< end){
            
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        
        // step 3 - convert array into string
        return new String(chars);
    }
}
