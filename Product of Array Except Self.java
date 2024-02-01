class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int temp = 1;
        int res[] = new int[len];
        res[0] = 1;
        for(int i = 0; i < len-1; i++)
        {
            temp = temp * nums[i];
            res[i+1] = temp;
        }
        temp = 1;
        for(int i = len - 1; i > 0; i--)
        {
            temp = temp * nums[i];
            res[i-1] *= temp;
        }
        return res;
    }
}
