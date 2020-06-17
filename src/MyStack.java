import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
	/** Initialize your data structure here. */

	Queue<Integer> q1;
	Queue<Integer> q2;

	public MyStack() {
		q1 = new ArrayDeque<>();
		q2 = new ArrayDeque<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		while (!q2.isEmpty()) {
			q1.offer(q2.peek());
			q2.poll();
		}
		q2.offer(x);
		while (!q1.isEmpty()) {
			q2.offer(q1.peek());
			q1.poll();
		}
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return q2.poll();
	}

	/** Get the top element. */
	public int top() {
		return q2.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return q2.isEmpty();
	}
}
