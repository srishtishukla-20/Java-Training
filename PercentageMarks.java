package PercentageSubjects;
import java.util.Scanner;

public class PercentageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total number of Subjects");
		Scanner sc=new Scanner(System.in);
		int values=sc.nextInt();//6
		int totalGrade=100*values;//600
		int[] myMarks=new int[values];
		System.out.println("Enter your marks");
		for(int i=0;i<values;i++)
		{
			myMarks[i]=sc.nextInt();
		}
		int sum=0;
		float percentage;
		for(int i=0;i<myMarks.length;i++)
		{
			System.out.println(myMarks[i]);
			sum+=myMarks[i];
		}
		percentage=(float) (sum*100)/totalGrade;
		System.out.println("Sum of Marks is "+sum);
		System.out.println("Percentage of total marks is "+ percentage+"%");
				
		

	}

}
