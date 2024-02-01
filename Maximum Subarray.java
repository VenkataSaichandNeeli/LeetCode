class Solution {
    public int maxSubArray(int[] nums) {
        int lenOfArray = nums.length;
        int maxSum = Integer.MIN_VALUE;
        //if(lenOfArray == 1)
            //return nums[0];
            int currSum = 0;
        for(int i = 0; i < lenOfArray; i++)
        {
                currSum += nums[i];
                currSum = Math.max(nums[i],currSum);
                maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
