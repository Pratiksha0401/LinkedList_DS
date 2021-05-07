package com.LinkedList;

public class myStack {
	public static void main(String[] args) {
		System.out.print("Stack :\n");
		Stack stack=new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.peek();
		System.out.print("Stack after pop:\n");
		stack.pop();
		stack.print();
	}
}

class Stack{
	
	private int maxSize;
	int top=-1;
	private int stk[];
	
	public Stack() {
		this.top=-1;
		this.stk=new int[10];
		}
	
	public Stack(int maxSize) {
		this.top=-1;
		this.stk=new int[maxSize];
		}
	
	public boolean push(int data){
		if(isFull()){
			System.out.print("Stack overFlow");
			return false;
		}else{
			stk[++top]=data;
			System.out.println(data +" pushed into stack");
			return true;
		}
	}

	public int pop(){
		if(isEmpty()){
			System.out.print("Stack underFlow");
			return 0;
		}else{
			return stk[top--];
		}
	}

	public void peek(){
		if(isEmpty()){
			System.out.print("Stack underFlow");
			
		}else{
			System.out.print("Top Element :"+stk[top]+"\n");
		}
	}

	public void print(){
		System.out.print("Stack elements are: \n");
		if(isEmpty()){
			System.out.print("Stack underFlow");
		}

		for(int ele=0 ;ele<=this.top ;ele++)
		{
			System.out.print(" "+stk[ele]);
		}
	System.out.println();
	}
			
	public boolean isEmpty(){
		return this.top < 0;
	}

	public boolean isFull(){
		return  this.top>=stk.length -1 ;
	}
}

