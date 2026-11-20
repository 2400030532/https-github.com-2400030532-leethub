class Solution {
    public void backtrack(List<String> res,StringBuilder path,int n){
        if(n==0){
            res.add(path.toString());
            return;
        }
        if(path.length()==0 || path.charAt(path.length()-1)!='0'){
            path.append('0');
            backtrack(res,path,n-1);
            path.deleteCharAt(path.length()-1);
        }
        path.append('1');
        backtrack(res,path,n-1);
        path.deleteCharAt(path.length()-1);
    }
    public List<String> validStrings(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,new StringBuilder(),n);
        return res;
    }
}