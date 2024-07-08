class Solution {
    int sum=0;
    public void totSum(TreeNode root, int tot){
        if(root==null) return;
        tot=root.val+(10*tot);
        if(root.left==null && root.right==null){
            sum+=tot;
        }
        totSum(root.left, tot);
        totSum(root.right, tot);
    }
    public int sumNumbers(TreeNode root) {
        totSum(root, 0);
        return sum;
    }
}