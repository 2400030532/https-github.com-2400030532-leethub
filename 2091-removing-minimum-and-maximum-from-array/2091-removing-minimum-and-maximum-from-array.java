class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int mini=0,maxi=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
    
            if(nums[i]<min){
                min=nums[i];
                mini=i;
            }
        
            if(nums[i]>max){
                max=nums[i];
                maxi=i;
            }
        }
        if(mini>maxi){
            int t=mini;
            mini=maxi;
            maxi=t;
        }
        int l=maxi+1;
        int r=n-mini;
        int b=(mini+1)+(n-maxi);
        return Math.min(l,Math.min(r,b));
    }
}