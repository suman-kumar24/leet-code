class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int minHeight = (height[left] < height[right]) ? height[left++] : height[right--];
            maxArea = Math.max(maxArea, width * minHeight);
        }

        return maxArea;
    }
}