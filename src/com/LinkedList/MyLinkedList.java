package com.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		System.out.println("LinkedList Data Structure");

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
}