package com.LinkedList;

public class myStack {
	public static void main(String[] args) {
		System.out.print("Stack :\n");
		LinkedList linkedList1 = new LinkedList();
		linkedList1.push(70);
		linkedList1.push(30);
		linkedList1.push(56);
		linkedList1.printStack();
		
		linkedList1.peak();
		
		System.out.print("Stack after Pop:\n");
		linkedList1.pop();
		linkedList1.printStack();
		}
}
