class Solution {
public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] charArray = s.toLowerCase().toCharArray();
        while(left < right)
        {
            if(!Character.isLetterOrDigit(charArray[left]))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(charArray[right]))
            {
                right--;
            }
            else
            {
                if(charArray[left] != charArray[right])
                {
                    return false;
                }
                left++; right--;
            }
        }
        return true;
    }
}