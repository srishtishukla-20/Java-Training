package userDefineExample;
public class userDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new useDefine("Srishti",24);
	
		}
		catch(ArithmeticException error)
		{
			System.out.println(error);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(useDefine e1)
		{
			System.out.println(e1);
		}
		finally {
			System.out.println("I am in final block");
		}
	}

}
