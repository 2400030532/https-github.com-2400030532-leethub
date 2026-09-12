class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb=new StringBuilder();
        for(int num:nums){
            String s=Integer.toString(num);
            sb.append(s);
        }
        int c=0;
        char ch=(char)(digit+'0');
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==ch){
                c++;
            }
        }
        return c;
    }
}