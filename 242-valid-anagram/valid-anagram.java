class Solution {
    public boolean isAnagram(String s, String t) {
        // int []count=new int[26];
        // for(char c:s.toCharArray()){
        //     count[c-'a']++;
        // }
        // for(char c:t.toCharArray()){
        //     count[c-'a']--;
        // }
        // for(int val:count){
        //     if(val!=0){
        //         return false;
        //     }
        // }
        // return true;
        Map<Character, Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        for(char c:t.toCharArray()){
            m.put(c, m.getOrDefault(c, 0)-1);
        }
        for(int res:m.values()){
            if(res!=0){
                return false;
            }
        }
        return true;
    }
}