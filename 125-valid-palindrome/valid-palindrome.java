class Solution {
    public boolean isPalindrome(String s) {
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                temp+=Character.toLowerCase(s.charAt(i));
            }
        }
        String rev=new StringBuilder(temp).reverse().toString();
        System.out.print(temp+" "+rev);
        return temp.equals(rev);
    }
}