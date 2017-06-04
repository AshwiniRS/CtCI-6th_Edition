package linkedlists;

import java.util.Arrays;

public class Node {
	char c;
	int data;
	Node next;
	
	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	Node(char c){
		this.c = c;
		this.next = null;
	}
	
	public Node createLinkedList(String str){
		Node head = null;
		char[] strArr = str.toCharArray();
	//	Arrays.sort(strArr);
		for(char c : strArr){
			if(head == null){
				head = new Node(c);
			}else{
				Node newNode = new Node(c);
				Node temp = head;
				while(temp.next!=null)
					temp=temp.next;
				temp.next=newNode;
			}
		}
		return head;
	}
	public Node createLinkedList(int[] str){
		Node head = null;
	//	char[] strArr = str.toCharArray();
	//	Arrays.sort(strArr);
		for(int c : str){
			if(head == null){
				head = new Node(c);
			}else{
				Node newNode = new Node(c);
				Node temp = head;
				while(temp.next!=null)
					temp=temp.next;
				temp.next=newNode;
			}
		}
		return head;
	}
	
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data + "->");
			head = head.next;
		}
	}
}
