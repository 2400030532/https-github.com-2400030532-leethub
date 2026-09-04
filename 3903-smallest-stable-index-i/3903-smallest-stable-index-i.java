class Solution {
    public int firstStableIndex(int[] nums, int k) {
      
        int n=nums.length;
        int x=-1;
        for(int r=0;r<n;r++){
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<=r;i++){
            max=Math.max(nums[i],max);
        }
        for(int i=r;i<n;i++){
            min=Math.min(nums[i],min);
        }
        if(max-min<=k){
            return r;
        }
        }
        return -1;
    }
}