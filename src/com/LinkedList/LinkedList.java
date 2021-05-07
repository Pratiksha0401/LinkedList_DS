package com.LinkedList;

public class LinkedList {
	Node head;
	Node last;
	Node sorted;
	int size=0;
	
		class Node {
		
		  int data;
		  Node next;
		
		  Node(int data){
			this.data = data;
			next =  null;
		  } 
	  }
	
	public void sortwhenPush(int data) {
		Node newNode = new Node(data);
		Node temp=head;
		if(temp == null) {
			head= newNode;
			return;
			}
		else {	 
			while(temp != null) {
				if(newNode.data < head.data) {
					newNode=head;
					temp=temp.next;
					
				}
				else if(newNode.data > head.data){
				newNode=head.next;
				temp=temp.next;
				}
			}
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

		head = head.next;
		
	}
	
	public void peak() {
		if(head == null)
			System.out.println("List is empty");

		System.out.println("Top Element : "+head.data);
		
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
		//System.out.print("LinkedList:");
	 	Node temp=head;
	 	
	 	while(temp != null) {
	 		System.out.print(temp.data+" -> ");
	 		temp = temp.next;
	 	     }
	     }
	
	public void printStack() {
		//System.out.print("LinkedList:");
	 	Node temp=head;
	 	
	 	while(temp != null) {
	 		System.out.print(temp.data+"\n");
	 		temp = temp.next;
	 	     }
	     }
	
	public void searchElement(int data)
    {
        Node n=head;
        int count=1;
        int flag=0;
        if(n==null) {
        	System.out.println("List is Empty");
        	return ;
        }
        else {
        while(n != null)
        {	   
		   if(n.data == data) {
	       	flag=1;
	       	break;
	       }
		   count =count+1;
            n=n.next;   
        }
        }
        if(flag==1)
        	System.out.println("Node with value "+data+" is found at position " +count);
        else
        	 System.out.println("Element is not present in the list");  
    }
	
	 public void deletebyData(int data) {
   	  Node temp=head;
   	  Node prev=null;
   	  
   	  if (temp != null && temp.data == data) {
   		  head=temp.next;
   	
   	  }
   	  
   	  while(temp != null && temp.data != data) {
   		  prev = temp;
   		  temp = temp.next;
   	  }	  
   	  
   	  if (temp != null) {
   		  prev.next =temp.next;
   	  }
   	  
   	  if (temp == null) {
   		  System.out.println(data+ " not found");
   	  }
   	  
    }
}
