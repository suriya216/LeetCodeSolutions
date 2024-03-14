class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0 , sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();        
        map.put(0,1);
        for(int num : nums){
            sum += num;
            if(map.containsKey(sum - goal)) ans += map.get(sum-goal);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}