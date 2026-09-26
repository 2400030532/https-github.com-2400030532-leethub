class Solution {
    public int trap(int[] height) {
        int lmax=0,rmax=0;
        int s=0,e=height.length-1;
        int ts=0;
        while(s<e){
            lmax=Math.max(lmax,height[s]);
            rmax=Math.max(rmax,height[e]);
            if(lmax<rmax){
                ts+=(lmax-height[s]);
                s++;
            }else{
                ts+=(rmax-height[e]);
                e--;
            }
        }
        return ts;
    }
}