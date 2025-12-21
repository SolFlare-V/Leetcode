class Solution(object):
    def repeatedStringMatch(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: int
        """
        r = -(-len(b)//len(a))

        if b in a*r:
            return r
        if b in a*(r+1):
            return r+1
        
        return -1
    

