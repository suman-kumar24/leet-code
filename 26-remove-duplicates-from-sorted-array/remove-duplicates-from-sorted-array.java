class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle empty array case
        
        int k = 1; // Start from 1 as the first element is always unique
        for (int i = 1; i < nums.length; i++) { // Start from the second element
            if (nums[i] != nums[k-1]) { // Compare with the last unique element
                nums[k++] = nums[i]; // Update the position of the next unique element
            }
        }
        return k; // Number of unique elements
    }
}
