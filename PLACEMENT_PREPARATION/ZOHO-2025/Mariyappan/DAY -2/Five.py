# Find the longest increasing subsequence in an array.
def lis(arr):
    from bisect import bisect_left
    sub = []
    for num in arr:
        i = bisect_left(sub, num)
        if i == len(sub):
            sub.append(num)
        else:
            sub[i] = num
    return len(sub)
# Mariyappan
