class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n]; // 0 = unvisited, 1 = visiting, 2 = safe
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isSafe(i, graph, state)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isSafe(int node, int[][] graph, int[] state) {
        if (state[node] != 0) {
            return state[node] == 2; // already determined
        }

        state[node] = 1; // mark as visiting
        for (int neighbor : graph[node]) {
            if (!isSafe(neighbor, graph, state)) {
                return false; // leads to a cycle or unsafe node
            }
        }

        state[node] = 2; // mark as safe
        return true;
    }
}

