class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n=nums.length;
        int c=0,p=0;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                c++;
                p=i;
            }
        }
        if(c>1) return false;
        else if(c==1){
         if(p==0 ||  p==n-2) return true;
         if(nums[p+1]>nums[p-1] || nums[p]<nums[p+2] ) return true;
         else return false;
        }
        return true;
    }
}