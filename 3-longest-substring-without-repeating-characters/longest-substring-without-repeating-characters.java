import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Map to store the last seen position of each character
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If we have seen the character before, move the left pointer
            // to the right of the last seen position of the character
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the last seen position of the character
            map.put(currentChar, right);

            // Calculate the current length and update the max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
