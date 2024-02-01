class Solution {
    public int trap(int[] height) {
        int low = 0;
        int high = height.length-1;
        int lowMax = Integer.MIN_VALUE;
        int highMax = Integer.MIN_VALUE;
        int ans = 0;
        while(low < high)
        {
            lowMax = Math.max(lowMax, height[low]);
            highMax = Math.max(highMax, height[high]);
            if( lowMax < highMax)
            {
                ans = ans + (lowMax - height[low++]);
            }
            else
            {
                ans = ans + (highMax - height[high--]);
            }
        }
        return ans;
        
    }
}
