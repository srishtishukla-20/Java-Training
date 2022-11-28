package twoDimensionalArray;
import java.util.Scanner;
public class twoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int column;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns of 2-dimensional array:-");
		row=sc.next();
		column=sc.next();
		String [][] names=new String[row][column];
		System.out.println("Enter the  names:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				names[i][j]=sc.next();
			}
		}
		System.out.println("My array is:");
		for (int i = 0; i<row; i++) {
			for (int j=0;j<column;j++) {
            System.out.print(names[i][j]+"  ");
			}
			System.out.println();
        }
		

	}

}
