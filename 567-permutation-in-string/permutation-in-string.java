class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            // Add current character to the window
            windowCount[s2.charAt(i) - 'a']++;

            // Remove the character that goes out of the window
            if (i >= windowSize) {
                windowCount[s2.charAt(i - windowSize) - 'a']--;
            }

            // Compare frequency arrays
            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        return false;        
    }

    private boolean matches(int[] s1Count, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != windowCount[i]) return false;
        }
        return true;
    }

}