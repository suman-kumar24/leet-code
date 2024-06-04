class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array to enable two-pointer technique
        Arrays.sort(nums);
        
        // Initialize the list to store the result
        List<List<Integer>> answer = new ArrayList<>();
        
        // If the array has less than 3 elements, return the empty list
        if (nums.length < 3) {
            return answer;
        }
        
        // Iterate through the array, treating each element as the first element of the triplet
        for (int i = 0; i < nums.length; i++) {
            // Since the array is sorted, if the current element is greater than 0, 
            // further elements will also be greater than 0, making the sum > 0.
            if (nums[i] > 0) {
                break;
            }
            
            // Skip duplicate elements to avoid duplicate triplets in the result
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Initialize two pointers for the two-sum problem
            int low = i + 1, high = nums.length - 1;
            
            // Use two-pointer technique to find pairs that sum up to -nums[i]
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                
                if (sum > 0) {
                    // If the sum is greater than 0, move the high pointer to the left
                    high--;
                } else if (sum < 0) {
                    // If the sum is less than 0, move the low pointer to the right
                    low++;
                } else {
                    // If the sum is 0, we found a triplet
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    
                    // Store the current low and high values to skip duplicates
                    int lastLowOccurrence = nums[low];
                    int lastHighOccurrence = nums[high];
                    
                    // Skip duplicate values for the low pointer
                    while (low < high && nums[low] == lastLowOccurrence) {
                        low++;
                    }
                    
                    // Skip duplicate values for the high pointer
                    while (low < high && nums[high] == lastHighOccurrence) {
                        high--;
                    }
                }
            }
        }
        
        // Return the list of triplets
        return answer;
    }
}
