# Find the length of the shortest subarray with a sum at least K.
from collections import deque
def shortest_subarray_sum_k(arr, k):
    prefix = [0]
    for num in arr:
        prefix.append(prefix[-1] + num)
    dq = deque()
    res = float('inf')
    for i in range(len(prefix)):
        while dq and prefix[i] - prefix[dq[0]] >= k:
            res = min(res, i - dq.popleft())
        while dq and prefix[i] <= prefix[dq[-1]]:
            dq.pop()
        dq.append(i)
    return res if res != float('inf') else -1
# Mariyappan
