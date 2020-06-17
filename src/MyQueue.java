import java.util.Stack;

public class MyQueue {
	/** Initialize your data structure here. */
	public MyQueue() {

	}

	Stack<Integer> s1 = new Stack(), s2 = new Stack();

	/** Push element x to the back of queue. */
	public void push(int x) {
		while (!s2.empty()) {
			s1.push(s2.peek());
			s2.pop();
		}
		s2.push(x);
		while (!s1.empty()) {
			s2.push(s1.peek());
			s1.pop();
		}
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		return s2.pop();
	}

	/** Get the front element. */
	public int peek() {
		return s2.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return s2.empty();
	}

	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		int param_2 = obj.pop();
		int param_3 = obj.peek();
		boolean param_4 = obj.empty();
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);

	}
}
