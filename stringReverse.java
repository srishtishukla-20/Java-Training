package inputData;

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word");
		String word=sc.next();
		String newName="";
//		System.out.println(word[0]);
		for(int i=word.length()-1;i>=0;i--)
		{
			char value=word.charAt(i);
			newName+=value;
		}
		System.out.println(newName);
		
	}

}
