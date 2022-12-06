package practiceQuestions;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num = 67;
		    boolean n=false;
		    for (int i = 2;i <= num/2;++i) {
		      if (num%i == 0) {
		        n= true;
		        break;
		      }
		    }

		    if (!n)
		      System.out.println(num+ " is a prime number.");
		    else
		      System.out.println(num+ " is not a prime number.");
		  }

	}


