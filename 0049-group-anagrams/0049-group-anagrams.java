class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List>mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] count=new int[26];
           StringBuilder sb=new StringBuilder();
           for(char ch:strs[i].toCharArray()){
                count[ch-'a']++;
           }
           for(int j:count){
              sb.append("#");
              sb.append(j);
           }
           String key=sb.toString();
           if(!mp.containsKey(key)){
            mp.put(key, new ArrayList<String>());
           }
           mp.get(key).add(strs[i]);
        }
        return new ArrayList(mp.values());

    }
}
