package com.linkedlist;

public class LinkedListOperation {

	Node head;

	public void insert(int ele) {
		Node n = new Node(ele);
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
		System.out.println(ele + " has been inserted in the LinkedList");
	}
	public void insertFirst(int ele) {
		Node n = new Node(ele);
		n.next=head;
		head=n;
		System.out.println(ele + " has been inserted in the LinkedList");
	}
	public void display() {
		if (head == null) {
			System.out.println("Linked list is empty");
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
		System.out.println();
	}
	
	public void delete() {
		if (head == null) {
			System.out.println("Linked list is empty");
		}
		else if (head.next == null) {
			head=null;
		}
		
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	public void deleteFirst() {
		if (head == null) {
			System.out.println("Linked list is empty");
		}
		head=head.next;
		}
}
