class Solution:
    def clearDigits(self, s: str) -> str:
        str=[]
        for i in s:
            if i.isdigit():
                str.pop()
            else:
                str.append(i)
        return "".join(str)