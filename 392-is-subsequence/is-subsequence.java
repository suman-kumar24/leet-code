class Solution {
    public boolean isSubsequence(String s, String t) {
        int sI = 0;
        int tI = 0;

        while(sI < s.length() && tI < t.length())
        {
            if(s.charAt(sI) == t.charAt(tI))
            {
                sI++;
            }
            tI++;
        }
        return s.length() == sI;
    }
}