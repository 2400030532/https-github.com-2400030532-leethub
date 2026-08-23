class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int p=0,ne=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                a[p]=nums[i];
                p+=2;
            }else{
                a[ne]=nums[i];
                ne+=2;
            }
        }
        return a;
    }
}