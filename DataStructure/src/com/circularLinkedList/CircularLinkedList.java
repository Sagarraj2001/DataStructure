package com.circularLinkedList;

public class CircularLinkedList {
	Node head = null;
	Node tail = null;

	public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
	
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) { // only one element
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }
	
	  public void deleteFromEnd() {
	        if (head == null) {
	            System.out.println("List is empty!");
	            return;
	        }
	        if (head == tail) {
	            head = tail = null;
	        } else {
	            Node temp = head;
	            while (temp.next != tail) {
	                temp = temp.next;
	            }
	            temp.next = head;
	            tail = temp;
	        }
	    }
	  
	  public void display() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }
}
