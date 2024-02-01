class Solution {
    public int rob(int[] nums) {
        int pre = 0, curr = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int temp = Math.max(pre + nums[i], curr);
            pre = curr;
            curr = temp;
        }
        return curr;
    }
}
