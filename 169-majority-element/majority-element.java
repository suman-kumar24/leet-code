class Solution {
    public int majorityElement(int[] nums) {

    int count = 0;
    int candidate = Integer.MIN_VALUE; // Initialize with min value

    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }
      count += (num == candidate) ? 1 : -1;
    }

    return candidate;
    }
}