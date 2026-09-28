/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        Queue<Node>q=new LinkedList<>();
        int x=0;
        q.offer(root);
        if(root==null){
            return 0;
        }
        while(!q.isEmpty()){
            int n=q.size();
            
            while(n-->0){
                Node node=q.poll();
                for(Node c:node.children){
                    q.offer(c);
                }
            }
            x++;
        }
        return x;
    }
}