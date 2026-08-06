class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+t;i++){
            int y=i,p=1;
            while(y>0){
                int x=y%10;
                p*=x;
                y=y/10;
            }
            if(p%t==0){
                return i;
            }
        }
        return -1;
    }
}