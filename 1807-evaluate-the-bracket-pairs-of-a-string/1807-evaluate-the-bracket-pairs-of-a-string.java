class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String>mp=new HashMap<>();
        for(var k:knowledge){
            mp.put(k.get(0),k.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int l=0;
        while(l<s.length()-1){
            int r=l+1;
            String ss="";
            if(s.charAt(l)=='('){
                while(s.charAt(r)!=')'){
                    ss+=(s.charAt(r));
                    r++;
                }
                l=r;
                if(mp.containsKey(ss)){
                    sb.append(mp.get(ss));
                }else{
                    sb.append("?");
                }
            }else{
                sb.append(s.charAt(l));
            }
            l++;
        }
        if(s.charAt(s.length()-1)!=')'){
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}