from typing import List
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        for i in range(k):
            val=nums.pop()
            nums.insert(0,val)