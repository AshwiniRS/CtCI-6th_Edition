package linkedlists;

class IntWrapper{
	int value = 0;
}
public class KthToLastElement {

	//recurrsion
	public static Node kthtolastele1(Node head,int k, IntWrapper i){
		//edge cases
		if(head == null){
			return null;
		}
		Node node = kthtolastele1(head.next, k, i);
		i.value = i.value+1;
		if(i.value==k){
			return head;
		}
		return node;
	}
	
	//iterative
	public static Node kthtolastele1(Node head,int k){
		if(head == null)
			return null;
		Node temp = head;
		Node temp1 = head;
		for(int i=1;i<k;i++){
			if(temp == null)
				return null;
			temp = temp.next;
		}
		
		if(temp == null) return null;
		
		while(temp.next!=null){
			temp1 = temp1.next;
			temp = temp.next;
		}
		return temp1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Node nodeObj = new Node();
		Node head = nodeObj.createLinkedList(arr);
		int k = 2;
		IntWrapper i = new IntWrapper();
		Node nnn = kthtolastele1(head,k);
		System.out.println(nnn.data);
	}

}
