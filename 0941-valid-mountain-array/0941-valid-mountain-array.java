class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int d=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                continue;
            }else{
                d=i-1;
                break;
            }
        }
        if(d==0 || d==arr.length-1){
            return false;
        }
        for(int i=d+1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }
}