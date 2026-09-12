class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int sr=0;sr<n;sr++){
            List<Integer> temp=new ArrayList<>();
            int i=sr,j=0;
            while(i<n && j<n){
                temp.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(temp,Collections.reverseOrder());
             i=sr;
             j=0;
            for(int num:temp){
                grid[i][j]=num;
                i++;
                j++;
            }
        }
        for(int sc=1;sc<n;sc++){
            List<Integer> temp=new ArrayList<>();
            int i=0,j=sc;
            while(i<n && j<n){
                temp.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(temp);
            i=0;
            j=sc;
            for(int nums:temp){
                grid[i][j]=nums;
                i++;
                j++;
            }

        }
        return grid;
    }
}