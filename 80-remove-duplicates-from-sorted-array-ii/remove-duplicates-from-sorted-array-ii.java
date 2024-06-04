class Solution {
public int removeDuplicates(int[] nums) {
    int count = 0; // Count the occurrences of current element
    int index = 0; // Index to update the array in-place
    
    for (int i = 0; i < nums.length; i++) {
        // If the current element is different than the previous one
        if (i == 0 || nums[i] != nums[i - 1]) {
            count = 1; // Reset count to 1 for new element
        } else {
            count++; // Increment count for repeated element
        }
        
        // If count is less than or equal to 2, update the array in-place
        if (count <= 2) {
            nums[index++] = nums[i];
        }
    }
    
    return index; // Return the length of the modified array
}
}