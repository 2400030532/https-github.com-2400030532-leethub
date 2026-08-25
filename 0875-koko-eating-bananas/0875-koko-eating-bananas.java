class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(piles[i],max);
        }
        int l=1,r=max;
        while(l<r){
            int mid=(l+r)/2;
            long hours=0;
            for(int i=0;i<n;i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}