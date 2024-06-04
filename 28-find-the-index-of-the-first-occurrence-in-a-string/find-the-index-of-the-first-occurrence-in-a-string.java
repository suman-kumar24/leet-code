public class Solution {
  public int strStr(String haystack, String needle) {
    if (needle.isEmpty()) {
      return 0; // Empty needle is always found at index 0
    }

    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i; // Found the matching substring
      }
    }

    return -1; // Not found
  }
}
