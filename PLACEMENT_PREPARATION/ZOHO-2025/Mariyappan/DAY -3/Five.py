# Rotate an array to the right by k steps without using extra space.
def rotate_in_place(arr, k):
    k %= len(arr)
    def reverse(l, r):
        while l < r:
            arr[l], arr[r] = arr[r], arr[l]
            l += 1
            r -= 1
    reverse(0, len(arr)-1)
    reverse(0, k-1)
    reverse(k, len(arr)-1)
    return arr
# Mariyappan
