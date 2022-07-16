package com.yugam.demo;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.insertElement(10);
		linkedList.insertElement(90);
		linkedList.insertElement(20);
		linkedList.insertElement(17);
		linkedList.insertElement(12);
		
		linkedList.displayList();
		
		System.out.println("Deleting 20  (random-mid element)");
		linkedList.deleteElement(20);
		linkedList.displayList();
		
		System.out.println("deleting 10 (first element)");
		linkedList.deleteElement(10);
		linkedList.displayList();
		
		System.out.println("deleting 80 (non existing element)");
		linkedList.deleteElement(80);
		linkedList.displayList();
		
		System.out.println("deleting 12 (last element)");
		linkedList.deleteElement(12);
		linkedList.displayList();
	}

}
