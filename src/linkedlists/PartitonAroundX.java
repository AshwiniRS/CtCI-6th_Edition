/*
 *  Write code to partition a linked list around a value x, such that all nodes less than x
come before alt nodes greater than or equal to x
 */

package linkedlists;

public class PartitonAroundX {

	public static Node partition(Node head,int k){
		Node lessthanK = null;
		Node greaterthanK = null;
		Node temp = head;
		Node n = null;
		while(temp!=null){
			
			n = temp.next;
			if(temp.data < k){
				
					temp.next = lessthanK;
					lessthanK = temp;
				
			}else{
				
					temp.next = greaterthanK;
					greaterthanK = temp;
				
			}
			temp = n;
		}
		
		if(lessthanK == null)
			return greaterthanK;
		
		temp = lessthanK;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = greaterthanK;
		return lessthanK;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,4,1,5,8,2,7};
		Node nodeObj = new Node();
		Node head = nodeObj.createLinkedList(arr);
		int k =5;
		Node result = partition(head,k);
		nodeObj.printList(result);
	}

}
