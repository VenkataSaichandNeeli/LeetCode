class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int potentialDiff = target - nums[i];
            if(m.containsKey(potentialDiff))
            {
                return new int[]{m.get(potentialDiff), i};
            }
            m.put(nums[i], i);
        }
        return new int[]{};
    }
}
