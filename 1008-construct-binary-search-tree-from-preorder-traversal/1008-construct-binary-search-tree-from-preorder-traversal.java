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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildbst(preorder,Integer.MAX_VALUE);
    }
    public TreeNode buildbst(int[] a,int ub){
        if(i==a.length||a[i]>ub){
            return null;
        }
        TreeNode root=new TreeNode(a[i++]);
        root.left=buildbst(a,root.val);
        root.right=buildbst(a,ub);
        return root;
    }
}