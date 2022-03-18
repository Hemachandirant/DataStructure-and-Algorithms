package com.simplilearn.stack.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {
	
	
	private int top;
	
	private Employee[] stack;
	
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	
	public int getSize() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void pushdata(Employee data) {
		if(top==stack.length) {
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
			
		}
		stack[top++] = data; 
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee employee = stack[--top];
		stack[top]= null;
		return employee;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public void printStack() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		System.out.println("top->");
		for(int index = top-1;index>=0;index--) 
		{
			System.out.println(stack[index]);
		}
	}

}
