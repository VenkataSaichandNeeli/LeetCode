class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        res = sum(nums)
        i = 0
        leftSum = 0
        while(i < len(nums)):
            if leftSum == res-leftSum-nums[i]:
                return i
            leftSum += nums[i]
            i += 1
        return -1
    
