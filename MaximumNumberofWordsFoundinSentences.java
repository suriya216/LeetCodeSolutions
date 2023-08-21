class Solution {
    public int mostWordsFound(String[] sentences) {
       int n=sentences.length, count=0, max=0;
       for(int i=0;i<n;i++){
           count=1;
           String s=sentences[i];
           for(int j=0;j<s.length();j++){
               if(s.charAt(j)==' '){
                   count++;
               }
           }
           if(count>max){
               max=count;
           }
       }
       return max;
    }
}