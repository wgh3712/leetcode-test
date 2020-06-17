package com.linkList;

/**
 * 链表实现
 * 
 * @author wangguanghui
 *
 */
public class MyLinkedList {
	/*
	 * class LNode { private int val; private LNode next;
	 * 
	 * public int getVal() { return val; }
	 * 
	 * public void setVal(int val) { this.val = val; }
	 * 
	 * 
	 * 
	 * public LNode getNext() { return next; }
	 * 
	 * public void setNext(LNode next) { this.next = next; }
	 * 
	 * public LNode(int val, LNode next) { super(); this.val = val; this.next =
	 * next; }
	 * 
	 * public LNode() { super(); }
	 * 
	 * }
	 * 
	 * private LNode head;
	 * 
	 *//** Initialize your data structure here. */
	/*
	 * public MyLinkedList() { head = new LNode(); head.next = null; }
	 * 
	 *//**
		 * Get the value of the index-th node in the linked list. If the index is
		 * invalid, return -1.
		 */
	/*
	 * public int get(int index) { int i=0; head=head.next; while(head!=null
	 * &&i<=index) { i++; head=head.next; } if(i<index ||head==null) { return -1;
	 * }else { return head.val; } }
	 * 
	 *//**
		 * Add a node of value val before the first element of the linked list. After
		 * the insertion, the new node will be the first node of the linked list.
		 */
	/*
	 * public void addAtHead(int val) { LNode p=new LNode(); p.setVal(val);
	 * if(head.next!=null) { p.next=head.next; head.next=p; }else { head.next=p; } }
	 * 
	 *//** Append a node of value val to the last element of the linked list. */
	/*
	 * public void addAtTail(int val) { LNode cur=head; while(cur.next!=null) {
	 * cur=cur.next; } LNode p=new LNode(); p.setVal(val); cur.next=p; }
	 * 
	 *//**
		 * Add a node of value val before the index-th node in the linked list. If index
		 * equals to the length of linked list, the node will be appended to the end of
		 * linked list. If index is greater than the length, the node will not be
		 * inserted.
		 */
	/*
	 * public void addAtIndex(int index, int val) { int i=0; LNode pre=head.next;
	 * while(pre!=null && pre.next!=null &&i<=index-1) { i++; pre=pre.next; } LNode
	 * p=new LNode(); p.setVal(val); if(pre.next!=null) { p.next=pre.next; }
	 * pre.next=p; }
	 * 
	 *//** Delete the index-th node in the linked list, if the index is valid. *//*
																					 * public void deleteAtIndex(int
																					 * index) { int i=0; LNode
																					 * pre=head.next; while(pre!=null &&
																					 * pre.next!=null &&i<=index-1) {
																					 * i++; pre=pre.next; } LNode
																					 * cur=pre.next; if(cur!=null &&
																					 * cur.next!=null) {
																					 * pre.next=cur.next; } }
																					 */

	private class Node {
		public int val;
		public Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node dummyHead;
	int size;

	public MyLinkedList() {
		dummyHead = new Node(-1);
		size = 0;
	}

	public int get(int index) {
		if (index < 0 || index >= size)
			return -1;
		Node curr = dummyHead.next;
		for (int i = 0; i < index; i++)
			curr = curr.next;
		return curr.val;
	}

	public void addAtHead(int val) {
		addAtIndex(0, val);
	}

	public void addAtTail(int val) {
		addAtIndex(size, val);
	}

	public void addAtIndex(int index, int val) {
		if (index > size)
			return;
		if (index < 0)
			addAtHead(val);
		Node prev = dummyHead;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		Node node = new Node(val);
		node.next = prev.next;
		prev.next = node;
		size++;
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >= size)
			return;
		Node prev = dummyHead;
		for (int i = 0; i < index; i++)
			prev = prev.next;
		Node reNode = prev.next;
		prev.next = reNode.next;
		reNode.next = null;
		size--;
	}

}
