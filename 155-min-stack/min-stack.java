class MinStack {
    Stack<Integer> st;
    Stack<Integer> mst;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        st = new Stack<>();
        mst = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(mst.isEmpty()){
            mst.push(value);
        }
        else{
            mst.push(Math.min(value,mst.peek()));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
        if(!mst.isEmpty()){
            mst.pop();
        }
    }
    
    public int top() {
        int top = 0;
        if(!st.isEmpty()){
            top = st.peek();
        }
        return top;
    }
    
    public int getMin() {
        return mst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */