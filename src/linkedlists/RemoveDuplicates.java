package linkedlists;

import java.util.Arrays;

public class RemoveDuplicates {

	public static Node removeDup(Node head){
		Node current = head;
		if(head == null)
			return null;
		while(current!=null){
			Node runner = current;
		      while(runner.next!=null){
				if(current.c == runner.next.c){
					runner.next = runner.next.next;
				}else
					runner = runner.next;
			}
			current = current.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node nodeObj = new Node();
		String str = "FOLLOW UP";
		Node head = nodeObj.createLinkedList(str);
		head = removeDup(head);
		Node temp = null;
		temp = head;
		while(temp!=null){
			System.out.println(temp.c);
			temp = temp.next;
		}
	}

}
