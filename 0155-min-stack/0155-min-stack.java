class MinStack {

    Stack<Integer> st;
    Stack<Integer> MinStack;

    public MinStack() {
        st = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
         if(MinStack.isEmpty() || value <= MinStack.peek()){
            MinStack.push(value);
         }
        
    }
    
   public void pop() {
    if (st.peek().equals(MinStack.peek())) {
        MinStack.pop();
    }

    st.pop();
}
    
    public int top() {
           return st.peek();
    }
    
    public int getMin() {
          return MinStack.peek();
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