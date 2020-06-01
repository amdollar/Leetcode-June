package com.leetcode.week1;

public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(4);
		tn.val = 4;

		tn.left = new TreeNode(2);
		tn.left.left = new TreeNode(1);
		tn.left.right = new TreeNode(3);

		tn.right = new TreeNode(7);
		tn.right.left = new TreeNode(6);
		tn.right.right = new TreeNode(9);
		System.out.println("====Printing Preorder traversal before====");
		preOrderTraversal(tn);

		TreeNode treenode = invertTree(tn);

		System.out.println("\n====Printing Preorder traversal after reverse====");
		preOrderTraversal(treenode);

	}

	private static TreeNode invertTree(TreeNode treeNode) {
		if (treeNode == null)
			return treeNode;
		TreeNode left = invertTree(treeNode.left);
		TreeNode right = invertTree(treeNode.right);

		treeNode.left = right;
		treeNode.right = left;

		return treeNode;
	}

	private static void preOrderTraversal(TreeNode treeNode) {
		if (treeNode == null)
			return;
		preOrderTraversal(treeNode.left);
		System.out.print(treeNode.val + " ");
		preOrderTraversal(treeNode.right);

	}

}
