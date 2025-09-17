from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic={}
        n=len(nums)
        for i in range(n):
            if nums[i] in dic:
                return [dic[nums[i]],i]
            dic[target-nums[i]]=i