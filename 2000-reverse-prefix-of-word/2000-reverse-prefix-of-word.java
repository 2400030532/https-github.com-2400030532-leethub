class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        StringBuilder sb=new StringBuilder();
        int x=0;
        String c=String.valueOf(ch);
        if(!word.contains(c)){
            return word;
        }
        for(int i=0;i<n;i++){
            if(ch==word.charAt(i)){
                sb.append(word.charAt(i));
                x=i;
                break;
            }else{
                sb.append(word.charAt(i));
            }
        }
        sb.reverse();
        for(int i=x+1;i<n;i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}