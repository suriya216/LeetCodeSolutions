class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
            //Finding occurences of each values in given array
        }
        int n=nums.length/2;
        for(Map.Entry<Integer, Integer> e:m.entrySet()){
            if(e.getValue()>n)
            //Checking the occurence of the value greater the n/2
                return e.getKey();
        }
        return 0;
    }
}