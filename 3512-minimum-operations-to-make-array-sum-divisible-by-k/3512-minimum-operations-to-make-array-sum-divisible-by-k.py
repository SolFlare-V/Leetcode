class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        t = sum(nums)
        rem = t%k
        return rem

        