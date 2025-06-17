class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge case: if array is empty or k is 0
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1]; // Store the maximum for each window
        int ri = 0; // Result array index
        
        // Create a deque to store indices of potential maximum values
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove indices whose corresponding values are less than the current value
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add current index
            deque.offerLast(i);
            
            // If we have a valid window, add to result
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }
        
        return result;        
    }
}