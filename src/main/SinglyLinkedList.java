package main;

public class SinglyLinkedList {
	private class node {
		String data;
		node next;
		
		public node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	private node Head;
	private int size;
	
	public SinglyLinkedList() {
		this.Head = null;
		this.size =0;
	}
	
	public void add (String element) {
		node newNode = new node(element);
		
		if(Head==null) {
			Head = newNode;
		} else {
			node current = Head;
			while(current.next!= null) {
				current = current.next;
			}
				current.next = newNode;
		}
		
		size++;
	}
	
	public String get(int index) {
		
		if(index<0 || index >= size) {
			System.out.print("Invalid index");
			return null;
		} 
		node current = Head;
		for(int i=0; i<index; i++) 
		{
			current = current.next;
		}
		return current.data;	
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size ==0	;
	}
	
	public void printList() {
		
		System.out.print("[");
		
		node current = Head;
		while (current != null) {
			
			System.out.print(current.data);
			
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
		System.out.println("]");
	}
}
