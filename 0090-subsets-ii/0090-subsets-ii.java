class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>l=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        backtrack(nums,0,n,new ArrayList<>(),ans);
        return ans;
    }
    private static void backtrack(int[] a,int s,int n,List<Integer>l,List<List<Integer>>ans){
      if(!ans.contains(new ArrayList<>(l))){
        ans.add(new ArrayList<>(l));
      }
        
        for(int i=s;i<n;i++){
       //choose
        //  if(i>s && a[i-1]==a[i]){
        //     continue;
        //  }
        l.add(a[i]);
       //explore
        backtrack(a,i+1,n,l,ans);
       //undo
       l.remove(l.size()-1);
        }

    }
}