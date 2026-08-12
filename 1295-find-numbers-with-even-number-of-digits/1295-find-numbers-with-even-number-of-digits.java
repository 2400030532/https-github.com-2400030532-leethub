class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int num:nums){
            int c=0;
            while(num>0){
                num=num/10;
                c++;
            }
            if(c%2==0){
                x++;
            }
        }
        return x;
    }
}