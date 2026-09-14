class Solution {
    public int maxDepth(String s) {
        int max = 0, curr = 0;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                curr++;
                if(curr>max){
                    max = curr;
                }
            }
            else if(c==')'){
                curr--;
            }

        }
        return max;
    }
}