package com.stack;

import java.util.Scanner;

public class StackOperation {
	static int stack[];
	static int top;

	static void createStack(int size) {
		stack = new int[size];
		top = -1;
		System.out.println("Stack created........");
	}

	public static void push(int ele) {
		if (top == stack.length - 1) {
			System.out.println("Stack Overflow...");
		} else {
			top++;
			stack[top] = ele;
			System.out.println(ele + " element inserted in stack");
		}
	}

	public static void display() {

		if (top == -1) {
			System.out.println("Stack is EMPTY....");
		}

		else {
			System.out.println("Stack elements are: ");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}

	public static void pop() {
		if (top == -1)
			System.out.println("Stack Underflow........");
		else
			top--;
	}

	static boolean isEmpty() {
		return top == -1;
	}

	static boolean isFull() {
		return top == stack.length - 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("enter your choice:");
			System.out.println("1.create \n2.display\n3.push\n4.pop\n5.exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter stack size: ");
				int size = sc.nextInt();
				createStack(size);
				break;
			case 2:
				display();
				break;
			case 3:
				System.out.println("enter the elemnt:");
				int ele = sc.nextInt();
				push(ele);
				break;
			case 4:
				pop();
				break;
			case 5:
				System.out.println("good bye!!");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");

			}
		}
//		createStack(size);
//		display();
//		
//		pop();
//		
//		push(10);
//		push(20);
//		push(30);
//		push(40);
//		push(50);
//		push(60);
//		display();
//		
//		pop();
//		display();
//		

	}
}