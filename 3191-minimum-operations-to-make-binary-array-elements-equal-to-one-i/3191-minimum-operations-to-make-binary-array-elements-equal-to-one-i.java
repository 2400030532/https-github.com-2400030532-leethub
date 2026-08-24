class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int l=0,r=2,c=0;
        while(r<nums.length){
            if(nums[l]==0){
                for(int k=l;k<=r;k++){
                    nums[k]=1-nums[k];
                }
                 c++;
            }
           
            l++;
            r++;
        }
        for(int num:nums){
            if(num==0){
                return -1;
            }
        }
        return c;
    }
}