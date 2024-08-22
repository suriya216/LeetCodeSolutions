class Solution {
    public int findComplement(int num) {
        String []bit=Integer.toBinaryString(num).split("");
        for(int i=0;i<bit.length;i++){
            if(bit[i].equals("0")){
                bit[i]="1";
            }else if(bit[i].equals("1")){
                bit[i]="0";
            }
        }
        String res="";
        for(int i=0;i<bit.length;i++){
            res+=bit[i];
        }
        return Integer.parseInt(res, 2);
    }
}