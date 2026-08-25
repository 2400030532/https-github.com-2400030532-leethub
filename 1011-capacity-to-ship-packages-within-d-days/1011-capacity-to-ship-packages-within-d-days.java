class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int l=0,r=0;
        for(int num:weights){
            l=Math.max(l,num);
            r+=num;
        }
        while(l<r){
            int mid=(l+r)/2;
            if(canship(weights,days,mid)){
                r=mid;
            }else{
                l=mid+1;
            }

        }
        return l;
    
    }
    private boolean canship(int[] weights,int days,int mid){
        int d=1,cw=0;
        for(int num:weights){
            if(cw+num>mid){
                d++;
                cw=0;
            }
            cw+=num;
        }
        return d<=days;
    }
}