# Find the majority element in an array (appears more than n/2 times).
def majority_element(arr):
    count = cand = 0
    for num in arr:
        if count == 0:
            cand = num
        count += 1 if num == cand else -1
    return cand if arr.count(cand) > len(arr) // 2 else -1
# Mariyappan
