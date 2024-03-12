class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null)  return head;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.val;
            if(sum==0){
                head=temp.next;
                return removeZeroSumSublists(head);
            }
            temp=temp.next;
        }
        head.next=(removeZeroSumSublists(head.next));
        return head;
    }
}