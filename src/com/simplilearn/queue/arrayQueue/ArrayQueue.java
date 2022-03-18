package com.simplilearn.queue.arrayQueue;

public class ArrayQueue {
	
	private int front;
	private int rear;
	public Employee[] queue;
	
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public int getSize() {
		return rear-front;
	}
	
	public boolean isEmpty() {
		return getSize()==0;
	}
	
	public void addElement(Employee data) {
		if(rear==queue.length){
			Employee[] newArr = new Employee[2*queue.length];
			System.arraycopy(queue, 0, newArr, rear, queue.length);
			queue = newArr;
		}
	queue[rear++]= data;
	}
	public Employee peek() {
		if(isEmpty()) {
			front = 0;
			rear = 0;
			return null;
			
		}
		return queue[front];
	}
	public Employee remove() {
		if(isEmpty()) {
			front = 0;
			rear = 0;
			return null;
		}
		Employee employee = queue[front];
		queue[front] = null;
		front++;
		return employee;
	}
	
	public void printQueue() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			
		}
		for(int index = front;index<rear;index++){
			System.out.println(queue[index]);
		}
		System.out.println("<-Rear");
		}
	}


