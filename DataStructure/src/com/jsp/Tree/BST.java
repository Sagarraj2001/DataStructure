package com.jsp.Tree;

public class BST {
	void insert(Node root, int ele) {
		if (ele < root.data) {
			if (root.left == null) {
				root.left = new Node(ele);
				System.out.println(ele + " has been inserted towards left of " + root.data);
			} else {
				insert(root.left, ele);
			}
		} else if (ele > root.data) {
			if (root.right == null) {
				root.right = new Node(ele);
				System.out.println(ele + " has been inserted towards right of " + root.data);
			} else {
				insert(root.right, ele);
			}
		}
	}

	void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
}
