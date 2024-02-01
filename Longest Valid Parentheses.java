class Solution {
    public int longestValidParentheses(String s) {

        int size = s.length();
        Stack<Integer> res = new Stack<Integer>();
        for(int i = 0; i < size; i++)
        {
            if(s.charAt(i) == '(')
            res.push(i);
            else
            {
                if(!res.isEmpty() && s.charAt(res.peek()) == '(')
                {
                    res.pop();
                }
                else
                {
                    res.push(i);
                }
            }
        }
        int ans = 0;
        if(res.isEmpty())
        {
            ans = size;
        }
        else
        {
            int prev = size, curr;
            while(!res.isEmpty())
            {
                curr = res.peek();
                res.pop();
                ans = Math.max(ans, prev - curr - 1);
                prev = curr;
            }
            ans = Math.max(ans, prev - 0);
        }
    return ans;
        
    }
}
