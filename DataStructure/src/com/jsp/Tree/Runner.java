package com.jsp.Tree;

public class Runner {

	public static void main(String[] args) {
		int arr[] = { 80, 40, 23, 56, 95, 86, 99, 18 };
		Node root = new Node(arr[0]);
		BST bstImpl = new BST();
		for (int i = 1; i < arr.length; i++) {
			bstImpl.insert(root, arr[i]);
		}
		System.out.println("------------------PreOrder Traversal------------------");
		bstImpl.preOrder(root);
		System.out.println();
		System.out.println("------------------InOrder Traversal------------------");
		bstImpl.inOrder(root);
		System.out.println();
		System.out.println("------------------PostOrder Traversal------------------");
		bstImpl.postOrder(root);
	}

}
