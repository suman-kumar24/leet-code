class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations array
        Arrays.sort(citations);
        int n = citations.length;
        
        // Traverse the sorted array from the end to the beginning
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
}
}