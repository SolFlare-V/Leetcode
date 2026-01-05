class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        sumn=0
        summ=0
        for i in range(1,n+1):
            if i%m!=0:
                sumn+=i
            else:
                summ+=i
        return sumn-summ
