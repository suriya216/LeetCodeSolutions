class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm 
        int count=0;
        int temp=0;
        for(int i:nums){
            if(count==0){
                //Initially take first value of array as the temp value
                //If count is equals to zero after some iteration temp holds currently pointing indexes array value
                temp=i;
            }
            if(i==temp){
                //If the occurence of duplicate value count gets incremented
                count++;
            }else{
                //Otherwise it will get decremented
                count--;
            }
        }
        return temp;
        //Returning temp value which holds the repeated majority element
    }
}