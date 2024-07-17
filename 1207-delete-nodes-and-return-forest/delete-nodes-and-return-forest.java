/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode getTheRoot(TreeNode root,  Set<Integer> toDelete,List<TreeNode> ans){
        if(root == null) 
            return null;
        root.left =  getTheRoot(root.left, toDelete, ans);
        root.right= getTheRoot(root.right, toDelete, ans);
        if(toDelete.contains(root.val)){
            if(root.left  != null){
                ans.add(root.left );
            }
            if(root.right != null){
                ans.add(root.right);
            }
            return null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new LinkedList<>();
        Set<Integer> toDelete = new HashSet<>();
        for(int val : to_delete)toDelete.add(val);
        TreeNode result = getTheRoot(root, toDelete, ans);
        if (result != null) {
            ans.add(result);
        }
        return ans;
    }
}