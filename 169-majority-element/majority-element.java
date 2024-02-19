class Solution {
    public int majorityElement(int[] nums) {

        int majorityCount = 0;
        int candidate = nums[0]; // Initialize candidate with the first element

        for (int num : nums) {
            // If candidate matches current element, increment count
            if (num == candidate) {
                majorityCount++;
            } else {
                // If candidate doesn't match, decrement count and change candidate if count reaches 0
                majorityCount--;
                if (majorityCount == 0) {
                    candidate = num;
                    majorityCount = 1;
                }
            }
        }

        // Final check to ensure candidate is indeed the majority element
        majorityCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                majorityCount++;
            }
        }
        return candidate;
    }
}