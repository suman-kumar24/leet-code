class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE; // Initialize with a large value
        int left = 0; // Left pointer of the sliding window
        int sum = 0; // Current sum of the window

        for (int right = 0; right < n; right++) {
            sum += nums[right]; // Add the current element to the sum

            // While the current window sum is greater than or equal to the target
            while (sum >= target) {
                // Update the minimum length
                minLength = Math.min(minLength, right - left + 1);
                // Subtract the element at the left pointer from the sum and move the pointer
                sum -= nums[left++];
            }
        }

        // If minLength is not updated, it means no valid subarray was found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
