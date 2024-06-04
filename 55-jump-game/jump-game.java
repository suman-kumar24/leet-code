public class Solution {
  public boolean canJump(int[] nums) {
    int lastReachable = nums[0]; // Initialize with the first jump length

    for (int i = 1; i < nums.length; i++) {
      if (lastReachable < i) {
        return false; // Can't reach current position
      }
      lastReachable = Math.max(lastReachable, i + nums[i]); // Update furthest reachable index
    }

    return true; // Reached the last index
  }
}
