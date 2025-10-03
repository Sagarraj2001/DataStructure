package com.linkedlist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedListOperation li=new LinkedListOperation();
		Scanner sc = new Scanner(System.in);
        System.out.println("----------------------LinkedList Operation----------------------");
        while (true) {
            System.out.println("1.Insert\n2.Display\n3.Delete\n4.InsertFront\n5.DeleteFirst\n7.Exit");
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element for LinkedList : ");
                    int ele = sc.nextInt();
                    li.insert(ele);
                    break;
                case 2:
                	li.display();
                    break;
                case 3:
                	li.delete();
                    break;
                case 4:
                    System.out.println("Enter the element for LinkedList : ");
                    int el = sc.nextInt();
                    li.insertFirst(el);
                    break;
                case 7:
                    System.out.println("Bye Bye !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice, give a correct option");
            }
        }
	}

}
