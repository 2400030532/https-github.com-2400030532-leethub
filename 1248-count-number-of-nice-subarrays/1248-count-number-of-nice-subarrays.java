class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]%2;
        }
        int[] pc=new int[n+1];
        pc[0]=1;
        int s=0,ans=0;
        for(int num:nums){
            s+=num;
            if(s>=k){
                ans+=pc[s-k];
            }
            pc[s]++;
        }
        return ans;

    }
}