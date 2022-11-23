package simpleInterest;
import java.util.Scanner;
public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle");
		int[] array = new int[3];
		int principle=sc.nextInt();
		System.out.println("enter rate of interest");
		int rateOfInterest=sc.nextInt();
		System.out.println("enter time");
		int time=sc.nextInt();
		array[0]=principle;
		array[1]=rateOfInterest;
		array[2]=time;
		int si=(array[0]*array[1]*array[2])/100;
		System.out.println("Your Simple Interest is "+si);
		}

}


