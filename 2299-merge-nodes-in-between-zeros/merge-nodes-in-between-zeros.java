class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode newNode=head.next;
        ListNode sumAfterZero=newNode;
        while(sumAfterZero!=null){
            int sum=0;
            while(sumAfterZero.val!=0){
                sum+=sumAfterZero.val;
                sumAfterZero=sumAfterZero.next;
            }
            newNode.val=sum;
            sumAfterZero=sumAfterZero.next;
            newNode.next=sumAfterZero;
            newNode=newNode.next;
        }
        return head.next;
    }
}