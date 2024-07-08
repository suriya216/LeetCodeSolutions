class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0 || head.next==null ){
            return head;
        }
        int c=1;
        ListNode t = head;
        while(t.next!=null){
            c++;
            t=t.next;
        }
        k=k%c;
        if(k==0){
            return head;
        }
        
        t.next=head;
        t=head;
        for(int i=0;i<c-k-1;i++){
            t=t.next;
        }
        ListNode newHead=t.next;
        t.next=null;
        return newHead;
    }
}