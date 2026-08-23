class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=0,k=0;
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            j=i+1;
            k=n-1;
            if(i>0&&nums[i]==nums[i-1]){
                        continue;
                    }
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ll.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }

                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ll;
    }
}