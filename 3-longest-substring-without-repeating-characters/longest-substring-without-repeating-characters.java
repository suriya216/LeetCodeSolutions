class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int maxLength = 0;
        HashSet<Character> set=new HashSet<>();
        for (int i=0;i<s.length();i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - j  + 1);
        }
        return maxLength;       
    }
}