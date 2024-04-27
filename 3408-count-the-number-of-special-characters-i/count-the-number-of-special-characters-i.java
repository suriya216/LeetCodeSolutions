class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> s=new HashSet<>();
        int n=word.length();
        for(int i=0;i<n;i++){
            s.add(word.charAt(i));
        }
        List<Character> l=new ArrayList<>(s);
        int count=0;
        for(int i=0;i<l.size();i++){
            int c1=(int)l.get(i);
            for(int j=i+1;j<l.size();j++){
                int c2=(int)l.get(j);
                if(Math.abs(c2-c1)==32){
                    count++;
                }
            }
        }
        return count;
    }
}