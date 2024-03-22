class Solution {
    public int lengthOfLIS(int[] A) {
        List<Integer> list=new ArrayList<>();
        int N=A.length;
		for(int i=0;i<N;i++){
		    int num=A[i];
		    if(list.isEmpty() || list.get(list.size()-1)<num){
		        list.add(num);
		    }else{
		        int l=0, r=list.size()-1;
		        int j=0;
		        while(l<=r){
		            int mid=l+(r-l)/2;
		            if(list.get(mid)>=num){
		                r=mid-1;
		                j=mid;
		            }else{
		                l=mid+1;
		            }
		        }
		        list.set(j,num);
		    }
		}
		return list.size();
    }
}