class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else if(s.charAt(i)==')'){
                int start=st.pop();
                int l=start+1;
                int r=i-1;
                while(l<r){
                    char t=ch[l];
                    ch[l]=ch[r];
                    ch[r]=t;
                    l++;
                    r--;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char a:ch){
            if(a!='('&&a!=')'){
                sb.append(a);
            }
        }
        return sb.toString();
    }
}