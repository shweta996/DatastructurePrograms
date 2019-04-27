package com.DataStructue;

public class QueueBank {

	int[] array = new int[10];
	int front = 0;
	int rear = 0;

	public boolean isFull() {
		if (front == 10) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean isEmpty() {
		if(rear == front) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Overflow");
		} else {
			array[rear] = data;
			rear++;
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow");
		} else {
			front++;
		}
	}
	
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Underflow");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(array[i]);
			}
		}
	}

}
