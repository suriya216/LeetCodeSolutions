class Solution {
    public boolean validPath(int n, int[][] edges, int sur, int dest) {
       Map<Integer, List<Integer>> adjList =new HashMap<>();
       if(sur==dest){
        return true;
       }
       for(int i=0;i<edges.length;i++){
        int []t=edges[i];
        if(!adjList.containsKey(t[0])){
            adjList.put(t[0], new ArrayList<>());
        }
        if(!adjList.containsKey(t[1])){
            adjList.put(t[1], new ArrayList<>());
        }
        adjList.get(t[0]).add(t[1]);
        adjList.get(t[1]).add(t[0]);
       }
       Queue<Integer> q=new LinkedList<>();
       boolean f=false;
       q.add(sur);
       while(!q.isEmpty()){
        int v=q.poll();
        boolean temp=false;
        List<Integer> l=adjList.containsKey(v)?adjList.get(v):new ArrayList<>();
        for(int i=0;i<l.size();i++){
            if(l.get(i)==dest){
                temp=true;
                break;
            }
            q.add(l.get(i));
        }
        adjList.remove(v);
        if(temp){
            f=true;
            break;
        }
       }
       return f;
    }
}