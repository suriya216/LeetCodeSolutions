class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i) !=' ' && s.charAt(i-1) == ' '){
                count=i;
                break;
            }
        }
        String str=s.substring(count).trim();
        return str.length();
    }
}