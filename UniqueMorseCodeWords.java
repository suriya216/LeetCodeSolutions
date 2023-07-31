class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[]=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
        "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."};
        Set<String> s=new HashSet<>();
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(char c:word.toCharArray()){
                sb.append(morse[c-'a']);
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}
