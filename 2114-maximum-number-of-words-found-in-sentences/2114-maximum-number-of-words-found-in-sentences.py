class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        n=0
        for i in sentences:
            count= len(i.split())
            n=max(count,n)
        return n

        