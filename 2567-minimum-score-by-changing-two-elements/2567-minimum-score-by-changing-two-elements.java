class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=nums[n-3]-nums[0];
        int h=nums[n-1]-nums[2];
        int r=nums[n-2]-nums[1];
        return Math.min(l,Math.min(h,r));
    }
}