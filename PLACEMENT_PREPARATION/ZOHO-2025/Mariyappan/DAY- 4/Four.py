# Count the number of subarrays that sum to a given value.
from collections import defaultdict
def count_subarrays_with_sum(arr, k):
    count = pre = 0
    freq = defaultdict(int)
    freq[0] = 1
    for num in arr:
        pre += num
        count += freq[pre - k]
        freq[pre] += 1
    return count
# Mariyappan
