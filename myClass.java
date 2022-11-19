package Calculator;
import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your operation");
		String input=sc.next();
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		if (input.equalsIgnoreCase("addition"))
		{
			System.out.println("The addition of 2 numbers is " +(num1+num2));
		}
		if (input.equalsIgnoreCase("substraction"))
		{
			System.out.println("The substraction of 2 numbers is " +(num1-num2));
		}
		if (input.equalsIgnoreCase("multiplication"))
		{
			System.out.println("The multiplication of 2 numbers is " +(num1*num2));
		}
		if (input.equalsIgnoreCase("division"))
		{
			System.out.println("The division of 2 numbers is " +(num1/num2));
		}

	}

}
