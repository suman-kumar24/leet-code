class Solution {
    public int lengthOfLastWord(String s) {
    String[] words = s.trim().split(" "); // Remove leading/trailing spaces and split by spaces
    return words.length > 0 ? words[words.length - 1].length() : 0;
    }
}