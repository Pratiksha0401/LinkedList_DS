package com.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList1 = new LinkedList();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		linkedList1.append(40);
		linkedList1.append(90);
		linkedList1.searchElement(80);
		
		linkedList1.printList();
		
	

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
	
	public void searchElement(int data)
    {
        Node n=head;
        int count=1;
        int flag=0;
        while(n != null)
        {	   
		   if(n.data == data) {
	       	flag=1;
	       	break;
	       }
		   count =count+1;
            n=n.next;   
        }
        
        if(flag==1)
        	System.out.println("Node with value "+data+" is found at position " +count);
        else
        	 System.out.println("Element is not present in the list");  
    }
}