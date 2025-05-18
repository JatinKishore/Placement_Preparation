# Search for an element in a rotated sorted array.
def search_rotated(arr, target):
    l, r = 0, len(arr) - 1
    while l <= r:
        m = (l + r) // 2
        if arr[m] == target:
            return m
        if arr[l] <= arr[m]:
            if arr[l] <= target < arr[m]:
                r = m - 1
            else:
                l = m + 1
        else:
            if arr[m] < target <= arr[r]:
                l = m + 1
            else:
                r = m - 1
    return -1
# Mariyappan
