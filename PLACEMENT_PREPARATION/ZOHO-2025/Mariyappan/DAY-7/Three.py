#3. Find combinations for target (order maintained):

python
Copy
Edit
def find_combinations(nums, target):
    res = []
    def dfs(i, path, total):
        if total == target:
            res.append(path)
            return
        if i >= len(nums) or total > target:
            return
        dfs(i + 1, path + [nums[i]], total + nums[i])
        dfs(i + 1, path, total)
    dfs(0, [], 0)
    return res

print(find_combinations([1, 3, 2, 0, 3], 3))
# Mariyappan