class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Index for the next element that is not 'val'
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Place element at index k and then increment k
            }
        }
        return k; // k is the length of the array without 'val'
    }
}
