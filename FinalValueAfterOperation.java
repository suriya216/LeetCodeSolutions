class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int fvalue=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X")||operations[i].equals("X++"))
                fvalue++;
            if(operations[i].equals("--X")||operations[i].equals("X--"))
                fvalue--;
        }
        return fvalue;
    }
}
