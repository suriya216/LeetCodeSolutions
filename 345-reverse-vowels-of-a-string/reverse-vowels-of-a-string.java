class Solution {
    public String reverseVowels(String s) {
         StringBuilder str = new StringBuilder();
        for(int i = s.length() -1; i>=0; i--){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) ==  'e' || s.charAt(i) ==  'E' || s.charAt(i) == 'i' || s.charAt(i) ==  'I'||s.charAt(i) ==  'o' || s.charAt(i) ==  'O' || s.charAt(i) ==  'u'|| s.charAt(i) ==  'U'){
                str.append(s.charAt(i));
            }
        }
        String vowel = str.toString();
        int j  = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) ==  'e' || s.charAt(i) ==  'E' || s.charAt(i) == 'i' || s.charAt(i) ==  'I'||s.charAt(i) ==  'o' || s.charAt(i) ==  'O' || s.charAt(i) ==  'u'|| s.charAt(i) == 'U'){
                res.append(vowel.charAt(j));
                j++;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}