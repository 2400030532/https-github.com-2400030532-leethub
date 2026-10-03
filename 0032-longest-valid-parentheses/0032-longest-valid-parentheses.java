class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        Stack<Integer>stk=new Stack();
        int res=0;
        stk.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stk.push(i);
            }else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }else{
                    res=Math.max((i-stk.peek()),res);
                }
            }
        }
        return res;
    }
}