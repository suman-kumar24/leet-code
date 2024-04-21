class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        Map<Integer,Integer> mp = new HashMap<>();

        for (int i=0; i<nums.length; i++)
        {
            if(mp.containsKey(target-nums[i]))
            {
                answer[0]=mp.get(target-nums[i]);
                answer[1] = i;
                return answer;
            }
            mp.put(nums[i],i);
        }

        return answer;
    }
}