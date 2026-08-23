class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=n-1;
        double min=Integer.MAX_VALUE;
        while(l<r){
            min=Math.min(min,(nums[l]+nums[r])/2.0);
            l++;
            r--;
        }
          return min;
    }
}