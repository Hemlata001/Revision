class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        // Iterate over the words from left to right (inclusive)
        for (int i = left; i <= right; i++) {
            String word = words[i];
            // Check if the first and last character are vowels
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check vowels
    private boolean isVowel(char ch) {
        // Compare lowercase vowels only
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
