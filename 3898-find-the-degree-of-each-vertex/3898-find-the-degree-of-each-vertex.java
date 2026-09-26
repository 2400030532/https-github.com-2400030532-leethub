class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] a=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int x=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    x++;
                }
            }
            a[i]=x;
        }
        return a;
    }
}