# Find the equilibrium index where left and right sums are equal.
def equilibrium_index(arr):
    total = sum(arr)
    left = 0
    for i, num in enumerate(arr):
        if left == total - left - num:
            return i
        left += num
    return -1
# Mariyappan
