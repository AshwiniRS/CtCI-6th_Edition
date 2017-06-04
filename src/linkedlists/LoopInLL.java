package linkedlists;

public class LoopInLL {

	public static Node detectCycle(Node head){
		  if(head==null || head.next==null || head.next.next==null)  return null;
		    Node pointer1 = head.next;
		    Node pointer2 = head.next.next;
		    //Step 1
		    while(pointer1!=pointer2){
		        if(pointer2.next==null || pointer2.next.next==null)   return null;
		        pointer1 = pointer1.next;
		        pointer2 = pointer2.next.next;
		    }
		    pointer1 = head;
		    //Step 2
		    while(pointer1!=pointer2){
		        pointer1 = pointer1.next;
		        pointer2 = pointer2.next;
		    }
		    return pointer1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEC";
		Node nodeObj = new Node();
		Node head = nodeObj.createLinkedList(str);
		Node cyclePoint = detectCycle(head);
		System.out.println(cyclePoint.c);
	}

}
