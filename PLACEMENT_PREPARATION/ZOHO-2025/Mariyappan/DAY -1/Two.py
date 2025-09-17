# Find all pairs in an array that sum to a specific target.
def find_pairs(arr, target):
    seen = set()
    res = []
    for num in arr:
        diff = target - num
        if diff in seen:
            res.append((diff, num))
        seen.add(num)
    return res
# Mariyappan
