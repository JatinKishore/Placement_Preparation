# Find all nodes in a directed graph from which all paths lead to terminal nodes.
def eventual_safe_nodes(graph):
    n = len(graph)
    state = [0]*n
    def dfs(u):
        if state[u] != 0:
            return state[u] == 2
        state[u] = 1
        for v in graph[u]:
            if not dfs(v):
                return False
        state[u] = 2
        return True
    return [i for i in range(n) if dfs(i)]
# Mariyappan
