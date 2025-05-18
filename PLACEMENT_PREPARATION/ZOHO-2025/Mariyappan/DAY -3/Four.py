# Find the median of two sorted arrays.
def find_median_sorted_arrays(a, b):
    if len(a) > len(b):
        a, b = b, a
    x, y = len(a), len(b)
    l, r = 0, x
    while l <= r:
        p1 = (l + r) // 2
        p2 = (x + y + 1) // 2 - p1
        maxL1 = float('-inf') if p1 == 0 else a[p1-1]
        minR1 = float('inf') if p1 == x else a[p1]
        maxL2 = float('-inf') if p2 == 0 else b[p2-1]
        minR2 = float('inf') if p2 == y else b[p2]
        if maxL1 <= minR2 and maxL2 <= minR1:
            if (x + y) % 2 == 0:
                return (max(maxL1, maxL2) + min(minR1, minR2)) / 2
            else:
                return max(maxL1, maxL2)
        elif maxL1 > minR2:
            r = p1 - 1
        else:
            l = p1 + 1
# Mariyappan
