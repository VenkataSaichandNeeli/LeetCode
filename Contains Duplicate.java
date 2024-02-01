class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        boolean flag = false;
        for(int i = 0; i < nums.length; i++)
        {
            if(m.get(nums[i]) == null)
            m.put(nums[i],1);
            else
            m.put(nums[i], m.get(nums[i]) + 1);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(m.get(nums[i]) >= 2)
                return true;
        }
        return flag;
    }
}
