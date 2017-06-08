package stacksandqueues;

import java.util.Stack;

public class SortStack {
	static Stack<Integer> stack1 = new Stack<Integer>();
	
	public static Stack sortStack(Stack<Integer> stack1){
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack1.isEmpty()){
			int temp = stack1.pop();
			while(!stack2.isEmpty() && stack2.peek()>=temp){
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
		return stack2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack1.add(1);
		stack1.add(2);
		stack1.add(3);
		stack1.add(4);
		stack1.add(5);
		stack1.add(6);
		
		Stack sorted = sortStack(stack1);
		while(!sorted.isEmpty()){
			System.out.println(sorted.pop());
		}
		
	}

}
