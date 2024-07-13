class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(i);
        }
        Collections.sort(l, (a, b)->Integer.compare(positions[a], positions[b]));
        Stack<Integer> s=new Stack<>();
        for(int i:l){
            if(directions.charAt(i)=='L'){
                while(!s.empty()){
                    int j=s.peek();
                    if(healths[i]==healths[j]){
                        healths[i]=0;
                        healths[j]=0;
                        s.pop();
                        break;
                    }else if(healths[i]>healths[j]){
                        healths[i]--;
                        healths[j]=0;
                        s.pop();
                    }else{
                        healths[i]=0;
                        healths[j]--;
                        break;
                    }
                }
            }else{
                s.push(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i:healths){
            if(i!=0){
                res.add(i);
            }
        }
        return res;
    }
}