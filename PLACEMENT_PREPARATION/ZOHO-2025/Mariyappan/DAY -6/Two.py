# Arrange numbers to form the largest possible number.
from functools import cmp_to_key
def largest_number(nums):
    def cmp(a, b): return (int(b+a) > int(a+b)) - (int(b+a) < int(a+b))
    nums = list(map(str, nums))
    nums.sort(key=cmp_to_key(cmp))
    return '0' if nums[0] == '0' else ''.join(nums)
# Mariyappan
