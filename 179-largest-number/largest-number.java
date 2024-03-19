class Solution {
    public String largestNumber(int[] nums) {
        String []s=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a,b)->{
            String t1=a+b;
            String t2=b+a;
            return t2.compareTo(t1);
        });
        if(s[0].equals("0")){
            return "0";
        }
        String res="";
        for(String str:s){
            res+=str;
        }
        return res;
    }
}