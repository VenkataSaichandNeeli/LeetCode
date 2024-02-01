class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = (height.length)-1;
        int area = 0;
        while(start < end)
        {
            area = Math.min(height[end] ,height[start]) * (end-start);
            if(height[end] > height[start])
                start++;
            else
                end--;
            max = Math.max(max,area);
        }
        return max;
        
    }
}
