class Solution(object):
    def missingNumber(self, nums):
        s = 0
        for i in range(1,len(nums)+1):
            s += i
        return s - sum(nums)