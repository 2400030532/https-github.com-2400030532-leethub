class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            if(e.getValue()>1){
                return true;
            }
        }
        return false;
  
    }
}