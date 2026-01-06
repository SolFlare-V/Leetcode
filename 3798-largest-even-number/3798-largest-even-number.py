class Solution:
    def largestEven(self, s: str) -> str:
        st=""
        for i in range(len(s)):
            if int(s)%2==0:
                st+=s
                break
            else:
                s=s[:len(s)-1]
        return st
            