package com.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList1 = new LinkedList();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		linkedList1.popLast();
		
		linkedList1.printList();
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.push(56);
		linkedList2.push(30);
		linkedList2.push(70);
		linkedList2.popLast();
		
		linkedList2.printList();

	}

}
class LinkedList{
	Node head;
	Node last;
	int size=0;
	
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
	 
	    last= head;
	    while(last.next != null) {
		last = last.next;
	    }
	    last.next=newNode;
	    size++;
	 }
	 
	public void insertAfter(Node prevNode, int data) {
   	     if(prevNode==null) {
   		 System.out.println("Previous node should not be null");
   	     }
   	 
   	     Node newNode = new Node(data);
   	     newNode.next = prevNode.next;
   	     prevNode.next = newNode;
    } 
	
	public void pop() {
		if(head == null)
			System.out.println("List is empty");
		Node temp = head;
		head = head.next;
		temp.next = null;
	}
	
	public void popLast() {
		if(head == null)
			System.out.println("List is empty");
		Node last = head;
		Node temp = null;
		while(last.next != null) {
			temp = last;
			last = last.next;
		}
		temp.next = null;
		last.next = temp.next;
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