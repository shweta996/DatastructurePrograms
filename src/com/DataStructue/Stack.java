package com.DataStructue;

public class Stack<T> {

	private class Node {
		private T data;
		private Node next;

		private Node(T data) {
			this.data = data;
		}

	}

	private Node top;

	// Push(item)
	public void push(T items) {
		Node node = new Node(items);
		node.next = top;
		top = node;
	}

	// pop
	public T pop() {
		T data = top.data;
		top = top.next;

		return data;

	}

	// isEmpty
	public boolean isEmpty() {
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	// peek
	public T peek() {
		if(isEmpty())
		{
			return null;
		}
		else
		{
			return top.data;
		}
	}

	// size
	public int size() {
		int count = 0;
		while(top != null) {
			top = top.next;
			count++;
		}
		return count;

	}

	
}
