class Solution {
    public int hIndex(int[] citations) {
        // Sort the array in descending order
        Arrays.sort(citations);
        
        // Traverse the sorted array to find the H-index
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i; // h is the number of papers with at least h citations
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
}
}