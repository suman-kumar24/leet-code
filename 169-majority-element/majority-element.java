class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int mLen =  nums.length/2 +1;
        
        for(int i = 0; i < nums.length ; i++)
        {
            int count = 0;
            for(int j = 0; j<nums.length ; j++ )
            {
                if(nums[i] == nums[j])
                    count++;
                if(count == mLen)
                    return nums[i];    
            }
        }
        return 0;
    }
}