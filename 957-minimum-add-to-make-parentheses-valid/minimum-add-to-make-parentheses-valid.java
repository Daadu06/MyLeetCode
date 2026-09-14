class Solution {
    public int minAddToMakeValid(String s) {   
        int first=0,sec=0;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                first++;
            }
            else{
                if(first>0){
                    first--;
                }
                else{
                    sec++;
                }
            }
        }
        return first+sec;
    }
}