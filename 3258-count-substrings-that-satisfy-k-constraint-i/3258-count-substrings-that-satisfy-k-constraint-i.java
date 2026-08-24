class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l=0,n=s.length(),c=0,zc=0,oc=0;
        for(int r=0;r<n;r++){
            if(s.charAt(r)=='0'){
                zc++;
            }else{
                oc++;
            }
            while(zc>k && oc>k){
                if(s.charAt(l++)=='0'){
                    zc--;
                }else{
                    oc--;
                }
            }
            c+=(r-l+1);
        }
        return c;
    }
}