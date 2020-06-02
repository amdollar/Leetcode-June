package com.leetcode.week1;

public class DeleteNode {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(9);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		System.out.println("====Before removing====");
		printList(node1);
		removeNode(node2);
		System.out.println("\n====After removing=====");
		printList(node1);
	}

	private static void printList(ListNode rootnode) {
		while (rootnode != null) {
			System.out.print(rootnode.val + " ");
			rootnode = rootnode.next;
		}
	}

	private static void removeNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
