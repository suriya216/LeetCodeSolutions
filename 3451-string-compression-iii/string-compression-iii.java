class Solution {
    public String compressedString(String word) {
       StringBuilder res=new StringBuilder();
       char ch=word.charAt(0);
       int count=1;
       for(int i=1;i<word.length();i++){
            if(word.charAt(i)==ch && count<9){
                count++;
            }else{
                res.append(count).append(ch);
                ch=word.charAt(i);
                count=1;
            }
       }
       res.append(count).append(ch);
       return res.toString();
    }
}