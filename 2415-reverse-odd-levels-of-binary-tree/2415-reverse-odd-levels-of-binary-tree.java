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
    public TreeNode reverseOddLevels(TreeNode root) {
        int l=0;
        if(root==null){
            return root;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                TreeNode node=q.poll();
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            l++;
            if(l%2==1 && !q.isEmpty()){
                int[] a=new int[q.size()];
                int i=0;
                for(TreeNode node:q){
                    a[i++]=node.val;
                }
                int j=q.size()-1;
                for(TreeNode node:q){
                    node.val=a[j--];
                }
            }
        }
            return root;
        }
    
    }
