package com.LinkedList;

public class MyQueue {

	public static void main(String[] args) {
		
		System.out.print("Queue :\n");
		LinkedList linkedList1 = new LinkedList();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		linkedList1.printList();
		
		System.out.print("\nQueue after Pop:\n");
		linkedList1.pop();
		linkedList1.printList();
		
	}
}
