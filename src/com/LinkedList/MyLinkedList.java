package com.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.push(56);
		linkedList2.push(30);
		linkedList2.push(70);
		linkedList2.insertAfter(linkedList2.head.next,40);
		System.out.println("LinkedList : ");
		linkedList2.printList();
		System.out.println("\nLinkedList : ");
		linkedList2.deletebyData(40);
		linkedList2.printList();
		
//		LinkedList linkedList1 = new LinkedList();
//		linkedList1.sortwhenPush(56);
//		linkedList1.sortwhenPush(70);
//		linkedList1.sortwhenPush(30);
//		
//		linkedList1.printList();
		

	}
}
