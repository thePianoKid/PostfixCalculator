import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
	int capacity;
	E[] elems;
	int top;

	@SuppressWarnings ("unchecked")
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		elems = (E[]) new Object[capacity];
		top = 0;
	}

	@SuppressWarnings ("unchecked")
	public void push(E item) {
		if (elems.length > top-1) {
			elems[top] = item;
			top++;
		} else {
			System.out.println("Stack capacity maxed out.");
		}
	}

	public E pop() {
		top--;
		E tmp = elems[top];

		return tmp;
	}

	public boolean isEmpty() {
		return top == 0;
	}
}