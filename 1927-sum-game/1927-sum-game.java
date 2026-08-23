class Solution {
    public boolean sumGame(String num) {
        int ls=0,rs=0,lq=0,rq=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                lq++;
            }else{
                ls+=num.charAt(i)-'0';
            }
        }
        for(int i=n/2;i<n;i++){
           
                if(num.charAt(i)=='?'){
                    rq++;
                }else{
                    rs+=num.charAt(i)-'0';
                }
            }
        
        return 2*(ls-rs)!=9*(rq-lq);
    }
}