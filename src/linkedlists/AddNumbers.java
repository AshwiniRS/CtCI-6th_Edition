package linkedlists;

public class AddNumbers {

	public static Node add(Node node1,Node node2){
		Node result = null;
		Node head = null;
		Node carry = new Node(0);
		while(node1!=null && node2!=null){
			if(result == null){
				int sum = node1.data + node2.data;
				result = new Node(sum%10);
				head=result;
				carry = new Node(sum/10);
			}else{
				
				int sum = node1.data + node2.data+carry.data;
				result.next = new Node(sum%10);
				result = result.next;
				carry = new Node(sum/10);
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		if(node1!=null){
			
			int sum = node1.data + carry.data;
			result.next = new Node(sum%10);
			result = result.next;
			carry = new Node(sum/10);
			node1 = node1.next;
		}
		if(node2!=null){
			
			int sum = node2.data + carry.data;
			result.next = new Node(sum%10);
			result = result.next;
			carry = new Node(sum/10);
			node2 = node2.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {7,1,6};
		int[] num2 = {9,5};
		
		Node nodeObj = new Node();
		Node nums1Node = nodeObj.createLinkedList(num1);
		Node nums2Node = nodeObj.createLinkedList(num2);
		Node head = add(nums1Node,nums2Node);
		nodeObj.printList(head);
	}

}
