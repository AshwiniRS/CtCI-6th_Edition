package stacksandqueues;

public class ThreeStacksOneArray {

	int[] buffer = null;
	int numOfStacks = 0;
	int[] top = {-1,-1,-1};
	int stackSize = 100;
	public ThreeStacksOneArray() {
		numOfStacks = 3;
		buffer = new int[numOfStacks * stackSize];
	}

	public void push(int stackNum,int x){
		if((top[stackNum]+1)==stackSize) System.out.println("stack full");
		else{
			top[stackNum]++;
			buffer[stackNum*stackSize+top[stackNum]] = x;
		}
	}
	public int pop(int stackNum){
		if(top[stackNum] == -1){
			System.out.println("stack empty");
			return 0 ;
		}
		else{
			int val = buffer[stackNum*stackSize+top[stackNum]];
			top[stackNum]--;
			return val;
		}
	}

	public boolean isEmpty(int stackNum){
		if(top[stackNum] == -1){
			System.out.println("stack empty");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeStacksOneArray obj = new ThreeStacksOneArray();
		obj.push(0, 5);
		obj.push(1, 6);
		obj.push(2, 7);
		System.out.println(obj.pop(0));
		System.out.println(obj.pop(1));
		System.out.println(obj.pop(2));
		System.out.println(obj.isEmpty(0));
		System.out.println(obj.isEmpty(1));
		System.out.println(obj.isEmpty(2));
	}

}
