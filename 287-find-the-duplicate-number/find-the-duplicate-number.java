class Solution {
    public int findDuplicate(int[] nums) {
       int n = nums.length;

        // Use the Floyd's Cycle Finding Algorithm
        int slow = nums[0];
        int fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        // Find the starting point of the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}