package conditionExample;

import java.util.Scanner;

public class numIsSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1<num2 && num1<num3)
		{
			System.out.println(num1+" is small");
		}
		else if(num2<num1 && num2<num3)
		{
			System.out.println(num2+" is small");
		}
		else if(num3<num2 && num3<num2)
		{
			System.out.println(num3+" is small");
		}

	}

}
