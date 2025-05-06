from typing import List
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cur=0
        maxi=float('-inf')
        for i in range(len(nums)):
            cur+=nums[i]
            maxi=max(maxi,cur)
            if cur<0:
                cur=0
        return maxi