class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }
        List<Map.Entry<Integer, Integer>> l=new ArrayList<>(m.entrySet());
        Collections.sort(l, (a,b)->b.getValue()-a.getValue());
        int []res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=l.get(i).getKey();
        }
        return res;
    }
}