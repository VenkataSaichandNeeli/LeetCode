class Solution {
    static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                continue;
            }
            else
            {
                int j = i;
                while(j < nums.length-1 && nums[j] == 0)
                {
                    j++;
                }
                swap(nums, i, j);
            }
        }
        
        
    }
}
