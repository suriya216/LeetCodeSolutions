class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            char prev=s.charAt(i-1);
            char current=s.charAt(i);
            sum+=Math.abs(prev-current);
        }
        return sum;
    }
}