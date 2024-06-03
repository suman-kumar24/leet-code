class Solution {
    public boolean isPalindrome(String s) {
        
        //removing spaces and non-alphanumeric characters
        String as = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int first = 0;
        int last = as.length() - 1;

        for(int i = first; first < last ; first++, last-- )
            if(as.charAt(first) != as.charAt(last))
                return false;
        
        return true;

    }
}