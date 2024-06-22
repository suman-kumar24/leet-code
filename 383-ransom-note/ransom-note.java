class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a map to count the frequency of each character in the magazine
        Map<Character, Integer> magazineCharCount = new HashMap<>();

        // Fill the map with character counts from the magazine
        for (char c : magazine.toCharArray()) {
            magazineCharCount.put(c, magazineCharCount.getOrDefault(c, 0) + 1);
        }

        // Check if the ransom note can be constructed from the magazine characters
        for (char c : ransomNote.toCharArray()) {
            // If the character is not in the map or its count is 0, return false
            if (!magazineCharCount.containsKey(c) || magazineCharCount.get(c) == 0) {
                return false;
            }
            // Decrease the count of the character in the map
            magazineCharCount.put(c, magazineCharCount.get(c) - 1);
        }

        // If we can get through the entire ransom note, return true
        return true;
    }
}