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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode>st=new LinkedList<>();
        for(int num:nums){
            TreeNode cur=new TreeNode(num);
            while(!st.isEmpty()&& st.peek().val<num){
               cur.left=st.pop();
            }
            if(!st.isEmpty()){
                st.peek().right=cur;
            }
            st.push(cur);
        }
        return st.isEmpty() ? null : st.removeLast();
    }
}