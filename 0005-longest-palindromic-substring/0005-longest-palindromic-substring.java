class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int maxlen=1;
        String maxstr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+maxlen;j<=s.length();j++){
                if(maxlen<(j-i)&& ispal(s.substring(i,j))){
                    maxlen=j-i;
                    maxstr=s.substring(i,j);
                }
            }
          
        }
          return maxstr;
    }
    public boolean ispal(String s){
        int n=s.length();
        int l=0,r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}