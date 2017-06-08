package stacksandqueues;

import java.util.Stack;

public class Towers {
	private Stack<Integer> disks;
	private int index;
	
	Towers(int i){
		disks = new Stack<Integer>();
		index = i;
	}
	
	public int getIndex(){
		return index;
	}
	
	public void moveDisks(int n,Towers destination,Towers buffer){
		if(n>0){
			moveDisks(n-1,buffer,destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
	
	public void add(int i){
		if(!disks.isEmpty() && disks.peek() <= i)
			System.out.println("Error pushing the disk " + i);
		else
			disks.push(i);
	}
	
	public void moveTopTo(Towers tower){
		//if(!disks.isEmpty()){
		int i = disks.pop();
		tower.add(i);
		System.out.println("Move disk " + i + " from " + getIndex() + " to " + tower.getIndex());
		//}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=3;
		Towers[] towers = new Towers[3];
		for(int i=0;i<3;i++){
			towers[i] = new Towers(i);
		}
		int noOfdisks = 5;
		for(int i=noOfdisks;i>=0;i--){
			 towers[0].add(i);
		}
		towers[0].moveDisks(noOfdisks,towers[2],towers[1]);
	}

}
