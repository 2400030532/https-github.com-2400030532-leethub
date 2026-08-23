class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int r=n-1;
         StringBuilder b=new StringBuilder();
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
       
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }if(s.charAt(i)==' '|| i==n-1){
                sb.reverse();
                b.append(sb);
                if(s.charAt(i)==' '){
                    b.append(s.charAt(i));
                }
                sb=new StringBuilder();
            }
        }
        return b.toString();
    }
}