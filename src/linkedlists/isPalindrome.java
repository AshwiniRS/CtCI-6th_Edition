package linkedlists;

import java.util.Stack;

public class isPalindrome {

	public static boolean checkPalindrome(Node head){
		Stack<Character> stack = new Stack<Character>();
		if(head == null || head.next == null)
			return false;
		Node temp = head;
		Node temp1 = head;
		while(temp1!=null && temp1.next!=null){
			stack.push(temp.c);
			temp=temp.next;
			temp1=temp1.next.next;
		}
		
		if(temp1!=null){
			temp=temp.next;
		}
		while(temp!=null){
			char top = '0';
			if(!stack.isEmpty())
				top = stack.pop();
			if(temp.c != top)
				return false;
			temp=temp.next;
		}
			return true;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str = "ABCBA";
		Node nodeObj = new Node();
		Node head = nodeObj.createLinkedList(str);
		System.out.println(checkPalindrome(head));
	}

}
