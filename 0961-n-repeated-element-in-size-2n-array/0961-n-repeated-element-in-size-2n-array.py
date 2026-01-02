class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        s =[]
        for i in nums:
            if i in s:
                return i
            s.append(i)
