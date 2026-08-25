class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
       
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        int c=k;
        while(s.contains(c)){
            c+=k;
        }
        return c;
        
    }
}