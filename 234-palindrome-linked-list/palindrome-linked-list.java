class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int l=0, r=list.size()-1;
        while(l<=r && list.get(l)==list.get(r)){
            l++;
            r--;
        }
        return l>=r;
    }
}