/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> l=new ArrayList<>();
        int prev=head.val;
        head=head.next;
        int count=1;
        while(head.next!=null){
            count++;
            if((prev<head.val && head.val>head.next.val) || (prev>head.val && head.val<head.next.val)){
                l.add(count);
            }
            prev=head.val;
            head=head.next;
        }
        int []arr=new int[]{-1, -1};
        int n=l.size();
        if(n<=1){
            return arr;
        }
        arr[1]=l.get(n-1)-l.get(0);
        arr[0]=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            arr[0]=Math.min(l.get(i+1)-l.get(i), arr[0]);
        }
        return arr;
    }
}