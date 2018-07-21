package com.springstudy.controller;

import java.util.Stack;

class Note {
	int value;
	Note next;

	public Note(int value) {
		this.value = value;
	}
}

public class Lianb2 {
	public static void main(String[] args) {
		Note note = new Note(1);
		Note note1 = new Note(2);
		Note note2 = new Note(3);
		note.next = note1;
		note1.next = note2;
		Note temp =note;

		while (note != null) {
			System.out.print(note.value);
			note = note.next;
		}
		
		
	Note ww=fzmeath(temp);
	while(ww!=null){
		System.out.print("\t"+ww.value);
		ww=ww.next;
	}
	
		

	}
	
	public static Note fzmeath(Note note){
		Note head = note;
		Stack<Note> stack =new Stack<Note>();
		
		while(note!=null){
			stack.push(note);
			note=note.next;
		}
		head.next=null;
		Note temp =stack.pop();
		Note HEAD =temp;
		while(!stack.isEmpty()){
		
			Note temp2=stack.pop();
			
			temp.next=temp2;
			
			temp =temp2;
			
			
		}
		
		return HEAD;
		
		
	}
}