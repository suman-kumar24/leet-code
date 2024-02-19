class Solution {
    public int majorityElement(int[] nums) {

        int majorityCount = 0;
        int candidate = nums[0]; 
        
        for (int num : nums) {
            if (num == candidate) {
                majorityCount++;
            } else {
                majorityCount--;
                if (majorityCount == 0) {
                    candidate = num;
                    majorityCount = 1;
                }
            }
        }
        
        return candidate;
    }
}