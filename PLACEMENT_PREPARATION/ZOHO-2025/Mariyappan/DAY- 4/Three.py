# Find a peak element in an array (greater than its neighbors).
def find_peak(arr):
    l, r = 0, len(arr) - 1
    while l < r:
        m = (l + r) // 2
        if arr[m] < arr[m+1]:
            l = m + 1
        else:
            r = m
    return l
# Mariyappan
