class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack();
        for(String s1:operations){
            if(s1.equals("+")){
                int top=s.pop();
                int newTop=top+s.peek();
                s.push(top);
                s.push(newTop);
            }else if(s1.equals("D")){
                s.push(s.peek()*2);
            }else if(s1.equals("C")){
                s.pop();
            }else{
                s.push(Integer.valueOf(s1));
            }
    }
    int ans=0;
    for(int i:s){
        ans+=i;
    }
    return ans;
    }
}