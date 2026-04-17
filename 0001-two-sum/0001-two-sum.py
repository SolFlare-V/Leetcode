class Solution(object):
    def twoSum(self, nums, target):
        a ={}
        for k,n in enumerate(nums) :
            c = target-n
            if c in a:
                return [a[c],k]
            a[n] = k
        