package com.LinkedList;

public class MyQueue {

	public static void main(String[] args) {
		
		Queue queue = new Queue(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
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
		this.size = -1;
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
		System.out.println("Queue element are:");
		
		for(int ele=0; ele <=this.size; ele++) {
		   System.out.print(que[ele]+" ");
		}
		
		System.out.println();
	}
}	
