package largestArray;

import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size1=sc.nextInt();
		int[] nums=new int[size1];
		
		int max=nums[0];
		System.out.println("Enter elements");
		for(int i=0;i<size1;i++)
		{
			
			nums[i]=sc.nextInt();
		
			
		}
		
		for(int j=0;j<nums.length;j++) {
			if(nums[j]>max)
			{
				max=nums[j];
			}
		
		}
		System.out.println("Maximum element is "+max);
	}
}


