class Solution {
    public int compress(char[] chars) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < chars.length;)
        {
            int count = 1;
            char c = chars[i];
            while(i + 1 < chars.length && c == chars[i + 1])
            {
                count += 1;
                i += 1;
            }
            result.append(c);
            if(count > 1)
            {
                result.append(count);
            }
            i += 1;
        }
        char[] compare = result.toString().toCharArray();
        for(int i = 0; i < compare.length; i++)
        {
            chars[i] = compare[i];
        }
        return compare.length;
    }
}
