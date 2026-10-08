class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int p=n*m;
        int l=0,h=p-1;
        while(l<=h){
           int  mid=(l+h)/2;
            int i=mid/m;
            int j=mid%m;
            if(matrix[i][j]==target){
                return true;
            }else{
                if(matrix[i][j]>target){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
     
        }
        return false;
    }
}