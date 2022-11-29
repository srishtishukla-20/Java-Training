package twoDimensionalArray;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] []names=new String[2][2];
		names[0][0]="24356";
		int num=Integer.parseInt(names[0][0]);
		int value=num-2;
		System.out.println(value);
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		int j=0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<=10);

	}

}
