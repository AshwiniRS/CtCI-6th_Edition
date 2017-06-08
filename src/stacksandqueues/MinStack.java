package stacksandqueues;

import java.util.Stack;

public class MinStack {
	
	    int min = 0;
	    Stack<Integer> stack = null;
	    /** initialize your data structure here. */
	    public MinStack() {
	        stack = new Stack<Integer>();
	        min = Integer.MAX_VALUE;
	    }
	    
	    public void push(int x) {
	        if(x<=min){
	            stack.push(min);
	            min=x;
	        }
	        stack.push(x);
	    }
	    
	    public void pop() {
	        if(stack.pop()==min) min=stack.pop();
	    }
	    
	    public int top() {
	    	if(!stack.isEmpty())
	    		return stack.peek();
	    	return 0;
	    }
	    
	    public int getMin() {
	        return min;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
	    obj.push(2);
	    obj.push(3);
	    obj.push(4);
	    obj.push(1);
	//	obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
	}

}
