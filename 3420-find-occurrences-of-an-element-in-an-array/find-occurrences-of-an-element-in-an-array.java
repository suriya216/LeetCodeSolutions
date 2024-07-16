class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer, Integer> m=new HashMap<>();
        int occ=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                occ++;
                m.put(occ, i);
            }
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(m.containsKey(queries[i])){
                res[i]=m.get(queries[i]);
            }else{
                res[i]=-1;
            }
        }
        return res;
    }
}