class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int n:nums){
            int l=res.size();
            for(int j=0;j<l;j++){
                List<Integer> sub=new ArrayList<>(res.get(j));
                sub.add(n);
                res.add(sub);
            }
        }
        return res;
    }
}