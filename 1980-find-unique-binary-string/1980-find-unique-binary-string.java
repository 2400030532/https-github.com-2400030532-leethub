class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        if(n==1){
            String s0="0";
            String s1="1";
            if(nums[0].equals(s0)){
                return s1;
            }else{
                return s0;
            }
        }
        List<Integer>l=new ArrayList<>();
        int x=nums[0].length();
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(nums[i],2);
            l.add(num);
        }
        int max=(int)(Math.pow(2,x)-1);
        int idx=0;
        for(int i=0;i<=max;i++){
            if(!l.contains(i)){
                idx=i;
            
            }
        }
        StringBuilder sbx=new StringBuilder();
        if(idx==0){
            while(x-->0){
                sbx.append(0);
            }
            return sbx.toString();
        }
        String bx=Integer.toBinaryString(idx);
        StringBuilder cx=new StringBuilder();
        if(bx.length()<x){
        while(cx.length()+bx.length()<x){
            cx.append(0);
        }
        return cx.append(bx).toString();
        }
        return bx;
    }
}