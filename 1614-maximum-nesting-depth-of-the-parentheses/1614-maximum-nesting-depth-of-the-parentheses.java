class Solution {
    public int maxDepth(String s) {
        int max=0,x=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                x++;
            }else if(ch==')'){
                x--;
            }
            max=Math.max(x,max);
        }
        return max;

    }
}