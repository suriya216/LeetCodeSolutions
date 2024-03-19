class Solution {
    public int minMoves(int target, int maxDoubles) {
        int c=0;
        while(maxDoubles!=0 && target!=1)
        {
            if(target%2!=0)
            {
                c++;
                target-=1;
            }
            target=target/2;
            c++;
            maxDoubles--;
        }
        if(target!=1)
        {
            c+=target-1;
        }
        return c;
    }
}