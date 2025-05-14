class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];
        
        // Compute prefix products
        products[0] = 1;
        for (int i = 1; i < n; i++) {
            products[i] = products[i - 1] * nums[i - 1];
        }
        
        // Compute suffix products and combine with prefix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            products[i] *= suffix;
            suffix *= nums[i];
        }
        
        return products;
    }
}