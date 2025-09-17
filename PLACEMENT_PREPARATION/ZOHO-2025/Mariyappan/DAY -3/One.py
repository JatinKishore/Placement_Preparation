# Find the first missing positive integer in an unsorted array.
def first_missing_positive(arr):
    n = len(arr)
    for i in range(n):
        while 1 <= arr[i] <= n and arr[arr[i]-1] != arr[i]:
            arr[arr[i]-1], arr[i] = arr[i], arr[arr[i]-1]
    for i in range(n):
        if arr[i] != i + 1:
            return i + 1
    return n + 1
# Mariyappan
