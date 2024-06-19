class Solution {
    private boolean canMakeBouquetsInDays(int[] bloomDay, int m, int k, int days) {
        int bouquetsDone = 0;
        int gathered = 0;
        for (int i = 0; i < bloomDay.length && bouquetsDone <= m; i++) {
            if (bloomDay[i] <= days) {
                if(++gathered == k) {
                    gathered = 0;
                    bouquetsDone++;
                }
            } else {
                gathered = 0;
            }
        }
        return bouquetsDone >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }
        int firstDay = Integer.MAX_VALUE, lastDay = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            firstDay = Math.min(firstDay, day);
            lastDay = Math.max(lastDay, day);
        }
        if (m == 1) {
            if( k == 1){
                return firstDay;
            } else if (k == bloomDay.length) {
                return lastDay;
            }
        }
        int low = firstDay, high = lastDay;
        int pivot;
        while(low <= high) {
            pivot = low + (high - low) / 2;
            if (canMakeBouquetsInDays(bloomDay, m, k, pivot)) {
                high = pivot -1;
            } else {
                low = pivot + 1;
            }
        }
        return low;
    }
}