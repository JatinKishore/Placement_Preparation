# Find the longest subarray with at most two distinct elements.
def longest_two_distinct(arr):
    from collections import defaultdict
    count = defaultdict(int)
    l = max_len = 0
    for r, c in enumerate(arr):
        count[c] += 1
        while len(count) > 2:
            count[arr[l]] -= 1
            if count[arr[l]] == 0:
                del count[arr[l]]
            l += 1
        max_len = max(max_len, r - l + 1)
    return max_len
# Mariyappan
