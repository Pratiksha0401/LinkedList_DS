package com.LinkedList;

public class MyQueue {

	public static void main(String[] args) {
		
		LinkedList linkedList1 = new LinkedList();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		linkedList1.printList();
		
		System.out.print("\nQueue after Pop:\n");
		linkedList1.pop();
		linkedList1.printList();
		
		
		Queue queue = new Queue(10);
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.print();
		
		queue.dequeue();
		queue.print();
	}
}

class Queue {
	
	int front, rear, size;
	int que [];
	int capacity;
	
	public Queue(int capacity) {
		this.capacity= capacity;
		this.que=new int[capacity];
		this.size = 0;
		this.front= 0;
		this.rear = -1;
	}
	
	public void enqueue (int data) {
		
		if(isFull()) {
		   System.out.println("Queue is full");
		   return;			
		}else {
		rear++;
		if(rear == capacity-1)
		   rear=0;
		}
		que[rear]=data;
		size++;
	}

	public boolean isFull() {
		return size == capacity;
	}
	
	public void print() {
		System.out.println("\nQueue elements are:");
		
		for(int ele=front; ele <=rear; ele++) {
		   System.out.print(que[ele]+" ");
		}
		
		System.out.println();
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		else {
			System.out.print(que[front]+": is removed\n");
				front++;
			size--;
		}
	}

	public boolean isEmpty() {
		return this.size==0;
	}
}	
