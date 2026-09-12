class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++){
            String s=details[i];
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(11));
            sb.append(s.charAt(12));
            String m=sb.toString();
            int nn=Integer.parseInt(m);
            if(nn>60){
                count++;
            }
        }
        return count;
    }
}