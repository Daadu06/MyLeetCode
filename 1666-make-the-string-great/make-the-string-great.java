class Solution {
    public String makeGood(String s) {
        if(s.length()<=1){
            return s;
        }
        String ans="";
            Stack <Character> st = new Stack<>();
            for(int i = 0; i < s.length();i++){
                char c = s.charAt(i);
                if (!st.isEmpty() &&
                Character.toLowerCase(c) == Character.toLowerCase(st.peek()) &&
                Character.isUpperCase(c) != Character.isUpperCase(st.peek())) {

                st.pop();
            } 
            else {
                st.push(c);
            }
            }
        for(char c : st){
            ans+=c;
        }
        return ans;
    }
}