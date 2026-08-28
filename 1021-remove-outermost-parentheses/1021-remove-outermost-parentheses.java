class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int o=0,st=0;
        for(char ch:s.toCharArray()){
            if(ch=='(' && st==0){
                st=1;
            }else if(ch=='(' && o>=0){
                o++;
                sb.append(ch);
            }else if(ch==')'&&o!=0){
                o--;
                sb.append(ch);
            }else if(ch==')'&&st==1&&o==0){
                st=0;
            }
        }
        return sb.toString();
    }
}