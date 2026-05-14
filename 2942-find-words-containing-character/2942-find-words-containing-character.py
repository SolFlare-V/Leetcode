class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        n = len(words)
        l = []
        for i in range(n):
            if x in words[i]:
                l.append(i)
        return l