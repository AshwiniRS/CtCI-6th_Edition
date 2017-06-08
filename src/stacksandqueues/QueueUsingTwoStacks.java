package stacksandqueues;

import java.util.Stack;

public class QueueUsingTwoStacks {
	Stack<Integer> stackNew,stackOld;
	
	public QueueUsingTwoStacks() {
		stackNew = new Stack<Integer>();
		stackOld = new Stack<Integer>();
	}
	public int size(){
		return stackNew.size() + stackOld.size();
	}
	
	public void add(int val){
		stackNew.push(val);
	}
	
	public void shifStack(){
		if(stackOld.isEmpty()){
			while(!stackNew.isEmpty()){
				stackOld.add(stackNew.pop());
			}
		}
	}
	
	public int peek(){
		shifStack();
		return stackOld.peek();
	}
	
	public int remove(){
		shifStack();
		return stackOld.pop();
	}
	
	public static void main(String[] args) {
		QueueUsingTwoStacks obj = new QueueUsingTwoStacks();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		
	}

}
