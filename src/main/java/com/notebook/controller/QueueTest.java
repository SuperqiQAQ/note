package com.notebook.controller;

import java.util.Stack;

public class QueueTest {
	
	public static void main(String[] args) {
		Que q =new Que();
		q.pushstack(1);
		q.pushstack(2);
		q.pushstack(3);
		int ww =q.popstack();
		q.pushstack(4);
		Stack<Integer> a1 =q.stack;
				for(Integer r:a1){
			System.out.println(r);
		}
	

			
	}
	
}
class Que{
	Stack<Integer> stack =new Stack<Integer>();
	Stack<Integer> stack1 =new Stack<Integer>();
	
	public void pushstack(int a){
		
		stack.push(a);
		
	}
	public Integer popstack(){
		Integer redata= null;
			while(!stack.isEmpty()){
				stack1.push(stack.pop());
			}
		
		if(!stack1.isEmpty()){
			redata =stack1.pop();
		}
		while(!stack1.isEmpty()){
			stack.push(stack1.pop());
		}
		return redata;
	}
}
	