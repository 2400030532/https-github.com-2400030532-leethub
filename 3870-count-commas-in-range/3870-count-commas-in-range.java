class Solution {
    public int countCommas(int n) {
        int x=0;
        String s=Integer.toString(n);
        if(s.length()>3){
            x=n-1000+1;
        }
        return x;
    }
}