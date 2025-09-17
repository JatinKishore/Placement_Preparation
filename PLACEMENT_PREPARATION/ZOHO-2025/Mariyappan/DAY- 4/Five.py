# Find the longest contiguous subarray with equal 0s and 1s.
def max_len_equal_0s_1s(arr):
    d = {0: -1}
    max_len = pre = 0
    for i, num in enumerate(arr):
        pre += -1 if num == 0 else 1
        if pre in d:
            max_len = max(max_len, i - d[pre])
        else:
            d[pre] = i
    return max_len
# Mariyappan
