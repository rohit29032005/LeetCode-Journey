class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i= i + 2*k){
            int min = Math.min(i + k , s.length());
            StringBuilder temp = new StringBuilder(s.substring(i,min));
            temp.reverse();
            sb.append(temp);
            int next = Math.min(i + 2*k , s.length());
            if(min < next){
                sb.append(s.substring(min , next));
            }
        }
        return sb.toString();
    }
}