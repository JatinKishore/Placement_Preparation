class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sumArray=0
        maxSum=float('-inf')
        for i in range(len(nums)):
            sumArray+=nums[i]
            if sumArray > maxSum:
                maxSum=sumArray
            if sumArray < 0:
                sumArray=0
        return maxSum
