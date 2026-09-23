class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character>l=new ArrayList<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch:s.toCharArray()){
            l.add(ch);
        }
        for(int i=0;i<t.length();i++){
            if(l.contains(t.charAt(i))){
                l.remove(Character.valueOf(t.charAt(i)));
            }else{
                return false;
            }
        }
        return true;
    }
}
