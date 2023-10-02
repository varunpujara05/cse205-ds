class MyQueue {

    Stack<Integer> in_stk = new Stack();
    Stack<Integer> op_stk = new Stack();
    
    public void push(int x) {
        in_stk.push(x);
    }
    
    public int pop() {
       peek();
       return op_stk.pop();
    }
    
    public int peek() {
        if (op_stk.isEmpty())
            while (!in_stk.isEmpty())
            op_stk.push(in_stk.pop());
        return op_stk.peek();
    }
    
    public boolean empty() {
        return in_stk.isEmpty() && op_stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */