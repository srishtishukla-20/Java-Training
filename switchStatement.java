package switchCae;
import java.util.Scanner;
public class switchStatement {
	public static void main(String[] args)
	{
		System.out.println("Enter the operation you want");
		Scanner sc=new Scanner(System.in);
		char operation=sc.next().charAt(0);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		switch(operation)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Not valid");
		}
	}

}
