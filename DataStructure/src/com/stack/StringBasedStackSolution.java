package com.stack;

public class StringBasedStackSolution {
	static char stack[];
	static int top = -1;
	
	static void push(char c) {
		top++;
		stack[top] = c;
	}
	
	static void pop() {
		top--;
	}

	
	public static void main(String[] args) {
		String s = "((()))";
		stack = new char[s.length()];
		boolean flag = true;
		
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i) == '(') {
				push('(');
			}
			
			else if(s.charAt(i) == ')' && top == -1) {
				flag = false;
				break;
			}
			
			else {
				pop();
			}
		}
		if(top == -1 && flag == true) {
			System.out.println("BALANCD");
		}
		else {
			System.out.println("NOT");
		}
	}
}