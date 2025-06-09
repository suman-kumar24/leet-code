class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // For A-Z
        int left = 0, maxCount = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            // Track the count of the most frequent character in the window
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If remaining letters > k, shrink window
            if ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;        
    }
}