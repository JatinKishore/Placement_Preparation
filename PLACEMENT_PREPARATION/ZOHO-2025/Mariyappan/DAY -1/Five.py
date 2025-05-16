# Find the contiguous subarray with the largest sum (Kadane’s Algorithm).
def max_subarray_sum(arr):
    max_sum = curr = arr[0]
    for num in arr[1:]:
        curr = max(num, curr + num)
        max_sum = max(max_sum, curr)
    return max_sum
# Mariyappan
