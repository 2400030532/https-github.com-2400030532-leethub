class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(boxes.charAt(j)=='1'){
                        sum+=(Math.abs(i-j));
                    }
                }
            }
            b[i]=sum;
        }
        return b;
    }
}