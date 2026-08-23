class Solution {
    public boolean isStrictlyPalindromic(int n) {
    
        for(int i=2;i<=n-2;i++){
            if(!ispal(Integer.toString(n,i))){
                return false;
            }
        }
        return true;
    }
    private static boolean ispal(String s){
        int l=0;
        int n=s.length()-1;
        int r=n;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}