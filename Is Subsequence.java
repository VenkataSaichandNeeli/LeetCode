class Solution {
    public boolean isSubsequence(String s, String t) {
        int firstStringPtr = 0;
        int secondStringPtr = 0;
        int size = t.length();
        int count = 0;
        if(size == 0 && s.length() == 0)
            return true;
        if(size == 0)
            return false;
        if(s.length() == 0)
            return true;
        for(int i = 0; i < size; i++)
        {
            if(s.charAt(firstStringPtr) == t.charAt(secondStringPtr))
            {
                firstStringPtr++;
                secondStringPtr++;
                count++;
            }
            else if(s.charAt(firstStringPtr) != t.charAt(secondStringPtr))
            {
                secondStringPtr++;
            }
            if(count == s.length())
            return true;
        }
        return false;
    }
}
