class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]%2!=0 ){
                    a[i]=nums1[i];
                } else if((nums1[i]-a[j])%2!=0 && j!=i){
                    a[i]=nums1[i]-a[j];
                
            }
        }
    }
    if(a.length!=n){
        return false;
    }
    return true;
}
}