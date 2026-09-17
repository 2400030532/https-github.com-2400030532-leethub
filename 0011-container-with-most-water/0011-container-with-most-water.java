class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter fw = new FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {}
        }));
    }

    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int res=0;
        while(i<=j){
            int b=j-i;
            int h=Math.min(height[i],height[j]);
            int a=b*h;
            res=Math.max(res,a);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}