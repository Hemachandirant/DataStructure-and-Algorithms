package com.simplilearn.stack.linkedstack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedStack {
	private int top;
	
	private LinkedList<Employee> stack;
	
	public LinkedStack(int capacity) {
		stack = new LinkedList<Employee>();
	}
	public int getSize() {
		return top;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public void pushData(Employee data) {
		stack.push(data);
	}
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.peek();
	}
	public Employee pop() {
		return stack.pop();
	}
	public void printStack() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		for(Employee emp:stack) {
			System.out.println(emp); 
		}
		}
	}
	

