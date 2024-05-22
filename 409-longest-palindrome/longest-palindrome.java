class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        boolean flag=false;
        int sum=0;
        for(Character ch:set){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch){
                    count++;
                }
            }
            if(count%2==0){
                sum+=count;
            }else{
                flag=true;
                sum+=count-1;
            }
        }
        if(flag){
            return sum + 1;
        }
        return sum;
    }
}