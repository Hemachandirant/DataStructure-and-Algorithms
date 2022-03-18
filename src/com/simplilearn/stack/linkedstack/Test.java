package com.simplilearn.stack.linkedstack;

import com.simplilearn.stack.arraystack.ArrayStack;
import com.simplilearn.stack.arraystack.Employee;

public class Test {

	public static void main(String[] args) {
		
		Employee employee = new Employee(123,"John","IT",13241.23);
		Employee employee1 = new Employee(1223,"David","Engineering",132241.23);
		Employee employee2 = new Employee(1233,"Kumar","HR",1321341.23);
		Employee employee3 = new Employee(1234,"Kunal","IT management",133241.23);
		Employee employee4 = new Employee(1253,"Micheal","Software Engineer",132431.23);
		
		ArrayStack stack = new ArrayStack(2);
		
		
		System.out.println("Stack Size: "+stack.getSize());
		System.out.println("Is Empty : "+stack.isEmpty());
		
		
		stack.pushdata(employee);
		stack.pushdata(employee1);
		stack.pushdata(employee2);
		
		System.out.println("Stack Size: "+stack.getSize());
		System.out.println("Is Empty : "+stack.isEmpty());
		System.out.println("Peek element : "+stack.peek());
		System.out.println("Pop element : "+stack.pop());
		System.out.println("Peek element : "+stack.peek());
		stack.printStack();

	}

}
