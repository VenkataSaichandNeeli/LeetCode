class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = 0
        i = 0
        j=0
        res = []
        while(i < len(nums)):
            while(j <= i):
                sum = sum + nums[j]
                res.append(sum)
                j += 1
            i += 1
        return res
