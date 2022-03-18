package com.simplilearn.queue.linkedQueue;

import java.util.LinkedList;

public class LinkedQueue {
	
	private int rear;
	private int front;
	public LinkedList<Employee> queue;
	
	
	public int getSize() {
		return queue.size();
	}
	public boolean isEmpty() {
		return queue.size()==0;
	}
	public void addElement(Employee data) {
		queue.push(data);
		
	}
	public Employee peek() {
		return queue.peekFirst();
	}
	public Employee removeData() {
		return queue.peekFirst();
	}
	public void printQueue() {
		for(Employee emp : queue) {
			System.out.println(emp);
		}
	}
	
	

}
