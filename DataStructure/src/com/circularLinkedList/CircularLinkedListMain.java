package com.circularLinkedList;

import java.util.Scanner;

public class CircularLinkedListMain {
	public static void main(String[] args) {
		 CircularLinkedList cll = new CircularLinkedList();
	        Scanner sc = new Scanner(System.in);
	        int data;
	        while (true) {
	            System.out.println("\n--- Circular Linked List Menu ---");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Delete from Beginning");
	            System.out.println("4. Delete from End");
	            System.out.println("5. Display");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert at beginning: ");
	                    data = sc.nextInt();
	                    cll.insertAtBeginning(data);
	                    break;

	                case 2:
	                    System.out.print("Enter data to insert at end: ");
	                    data = sc.nextInt();
	                    cll.insertAtEnd(data);
	                    break;

	                case 3:
	                    cll.deleteFromBeginning();
	                    break;

	                case 4:
	                    cll.deleteFromEnd();
	                    break;

	                case 5:
	                    cll.display();
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}

