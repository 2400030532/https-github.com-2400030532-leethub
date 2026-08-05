class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>l=new ArrayList<>();
        List<  List<Integer>>subsets=new ArrayList<>();
        int n=nums.length;
        backtrack(n,nums,0,new ArrayList<>(),subsets);
        return subsets;
    }
    static void backtrack(int n,int[] a,int s,List<Integer>l,List<List<Integer>>ans){
        ans.add(new ArrayList<>(l));
        for(int i=s;i<n;i++){
            l.add(a[i]);
            backtrack(n,a,i+1,l,ans);
            l.remove(l.size()-1);
        }
    }
}