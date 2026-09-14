class Solution {
    public String makeGood(String s) {
        int top = 0;
        char[] stack = new char[s.length()];
        for(char c : s.toCharArray()){
            if(top>0 && Math.abs(stack[top-1]-c)==32 ){
                top--;
            }
            else{
                stack[top++]=c;
            }
        }
        return new String(stack,0,top);
    }
}