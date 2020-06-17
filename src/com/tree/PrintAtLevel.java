package com.tree;

public class PrintAtLevel {

	static void printAtLevel(Tree root, int level) {
		if (root == null || level < 0) {
			return;
		} else if (level == 0) {
			System.out.println(root.data);
		} else {

			printAtLevel(root.left, level - 1);
			printAtLevel(root.right, level - 1);
		}
	}

	static class Tree {
		int data;
		Tree left, right;
	}

	public static void main(String[] args) {

		Tree root1 = new Tree();
		Tree root2 = new Tree();
		Tree root3 = new Tree();
		Tree root4 = new Tree();
		Tree root5 = new Tree();
		Tree root6 = new Tree();

		root1.data = 1;
		root1.left = root2;
		root2.data = 2;
		root1.right = root3;
		root3.data = 3;
		root2.left = root4;
		root4.data = 4;
		root2.right = root5;
		root5.data = 5;
		root3.right = root6;
		root6.data = 6;
		printAtLevel(root1, 1);
	}
}
