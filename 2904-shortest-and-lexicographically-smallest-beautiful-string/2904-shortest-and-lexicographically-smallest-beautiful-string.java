class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                a[c++]=i;
            }
        }
        if(c<k){
            return "";
        }
        String ans="";
        for(int i=0;i<c-k+1;i++){
            int st=a[i],end=a[i+k-1];
            String ca=s.substring(st,end+1);
            if(ans==""){
                ans=ca;
            }else if(ans.length()>ca.length()){
                ans=ca;
            }else if(ans.length()==ca.length() && ca.compareTo(ans)<0){
                ans=ca;
            }
        }
        return ans;       

    }
}