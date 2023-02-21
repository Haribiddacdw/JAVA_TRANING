package day3;

import java.util.Arrays;

public class Program3 {
	public static void main(String[] args) {
		FixedStack fs = new FixedStack(5);
//    	  fs.push(1);
//    	  fs.push(2);
//    	  fs.push(3);
//    	  fs.push(4);
//    	  fs.push(5);
//    	  fs.pop();
//    	  fs.pop();
//    	  fs.pop();
		DynamicStack ds = new DynamicStack(2);
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.pop();
		ds.pop();
	}
}

interface Stack {

	void push(int element);

	int pop();
}

class FixedStack implements Stack {

	int size;
	int arr[];
	int top;

	FixedStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	@Override
	public void push(int element) {

		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed element:" + element);
		} else {
			System.out.println("Stack is full !");
		}
	}

	@Override
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}

	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

}

class DynamicStack implements Stack {

	int size;
	int arr[];
	int top;

	DynamicStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	@Override
	public void push(int element) {

		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed element:" + element);
		} else {
			resize(size * 2);
			push(element);
		}
	}

	@Override
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		}
		{

			System.out.println("Stack is empty !");
			return -1;
		}

	}

	public void print() {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void resize(int newsize) {

		arr = Arrays.copyOf(arr, newsize);
		size = newsize;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}
}
