class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int[] a=new int[k];
        int dx=0;
        while(k-->0){
            int max=Integer.MIN_VALUE;
            int key=0;
           for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                key=e.getKey();
            }
           }
            a[dx++]=key;
            mp.remove(key);
        }
        return a;
    }
}
