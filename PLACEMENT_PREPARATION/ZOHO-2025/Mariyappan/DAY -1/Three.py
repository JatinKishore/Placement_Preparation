# Perform a cyclic rotation of an array by k positions.
def cyclic_rotate(arr, k):
    k %= len(arr)
    return arr[-k:] + arr[:-k]
# Mariyappan
