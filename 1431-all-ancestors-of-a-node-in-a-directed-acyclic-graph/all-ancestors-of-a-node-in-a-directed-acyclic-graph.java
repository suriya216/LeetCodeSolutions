class Solution {
    private void dfs(List<List<Integer>> graph, int i, int j, List<List<Integer>> ancestors) {
        for (int g : graph.get(j)) {
            if (ancestors.get(g).isEmpty()||ancestors.get(g).get(ancestors.get(g).size()-1)!=i){
                ancestors.get(g).add(i);
                dfs(graph, i, g, ancestors);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ancestors = new ArrayList<>(n);
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ancestors.add(new ArrayList<>());
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }for (int i = 0; i < n; i++) {
        dfs(graph, i, i, ancestors);
    }
    return ancestors;
    }
}