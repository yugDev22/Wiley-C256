package com.yugam.demo;

public class LinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;
	
	public void insertElement(int data) {
		Node newNode=new Node(data);
		
		//if list is blank
		if(head==null) {
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
	}
	
	public void displayList() {
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	public void deleteElement(int data) {
		Node currentNode = head;
		Node prev = null;
		//if list is empty
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		else if(currentNode!=null&&currentNode.data==data) {
			head=currentNode.next;
			return;
		}
		while(currentNode!=null && currentNode.data!=data) {
			prev=currentNode;
			currentNode=currentNode.next;
		}
		
		if(currentNode==null)
			return;
		
		prev.next=currentNode.next;
			
	}
}
