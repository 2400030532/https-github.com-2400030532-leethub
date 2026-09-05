class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefixsum=new int[n];
        int[] suffixsum=new int[n];
        prefixsum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=Math.max(prefixsum[i-1],nums[i]);
        }
        suffixsum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixsum[i]=Math.min(suffixsum[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(prefixsum[i]-suffixsum[i]<=k){
                return i;
            }
        }
        return -1;
    }
}