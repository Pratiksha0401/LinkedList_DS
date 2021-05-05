package com.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.push(70);
	    linkedList.push(30);
		linkedList.push(56);
		
		linkedList.printList();

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
	
	public void printList() {
		System.out.print("LinkedList:");
	 	Node temp=head;
	 	
	 	while(temp != null) {
	 		System.out.print(temp.data+" -> ");
	 		temp = temp.next;
	 	     }
	     }
}