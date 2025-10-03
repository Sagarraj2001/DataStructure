package com.doublyLinkedlist;

public class LinkedListOperation {
	Node head, tail;

	public void insert(int ele) {
		Node n = new Node(ele);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			n.prev = tail;
			tail = n;
		}
		System.out.println(ele + " has been inserted");
	}

	public void display() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
		System.out.println();
	}

	public void displayReverse() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = tail;
			while (temp.prev != null) {
				System.out.print(temp.data + "->");
				temp = temp.prev;
			}
			System.out.print(temp.data);
		}
		System.out.println();
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public void deleteFront() {
		if (head == null) {
			System.out.println("LinkedLsit is empty");
		} else {
			System.out.println(head.data+" has been deleted");
			head=head.next;
			head.prev=null;
		}
	}

	public void insertFirst(int ele) {
		Node n = new Node(ele);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head.prev = n;
			head = n;
		}
		System.out.println(ele + " has been inserted !!");
	}
	
}
