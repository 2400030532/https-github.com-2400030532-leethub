class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        Set<Integer>d=new HashSet<>();
        for(int num:nums){
            d.add(num);
        }
        int s=d.size(),res=0;
        for(int i=0;i<n;i++){
            Set<Integer>c=new HashSet<>();
            for(int j=i;j<n;j++){
                c.add(nums[j]);
            
            if(c.size()==s){
                res++;
            }
            }
        }
        return res;
    }
}