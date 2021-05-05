package com.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList linkedList1=new LinkedList();
		linkedList1.push(70);
	    linkedList1.push(30);
		linkedList1.push(56);
		linkedList1.printList();
		
		System.out.println("\n");
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.append(70);
	    linkedList2.append(30);
		linkedList2.append(56);
		linkedList2.printList();

	}

}
class LinkedList{
	Node head;
	
		class Node {
		
		  int data;
		  Node next;
		
		  Node(int data){
			this.data = data;
			next =  null;
		  }
	   }
	   
	public void push (int data) {
		Node newNode=new Node(data);
	 	newNode.next=head;
	 	head=newNode;	
	     }
	
	 public void append(int data) {
	    Node newNode = new Node(data);
	    if(head == null) {
		head= newNode;
		return;
	    }
	 
	    Node last= head;
	    while(last.next != null) {
		last = last.next;
	    }
	    last.next=newNode;
 }
	
	public void printList() {
		System.out.print("LinkedList:");
	 	Node temp=head;
	 	
	 	while(temp != null) {
	 		System.out.print(temp.data+" -> ");
	 		temp = temp.next;
	 	     }
	     }
}