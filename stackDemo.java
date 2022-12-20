package stackTest;

import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "AlgoKelvin";
		char[] character = data.toCharArray();
		System.out.println(character);

		Stack<Character> stack = new Stack<>();
		for (char dt: character) {
		stack.push(dt);
		}
//		System.out.println(stack);
		for (int x = 0; x < stack.size(); x+=1) {
		stack.pop();
//		System.out.println(stack);
		}
		System.out.println(stack);


	}

}
