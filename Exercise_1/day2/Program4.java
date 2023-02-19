package day2;

import java.util.Stack;
public class Program4 {
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
       
       for(int i = -1; i <= stack.size(); i++)
        {
            System.out.println(stack.pop());
        }
	}
}

