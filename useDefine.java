package userDefineExample;

public class useDefine extends Exception {
		String name;
		int age;
		useDefine(String name1,int age1)
		{
			name=name1;
			age=age1;
		}
		public void myexception()
		{
			System.out.println("My name is "+name);
			System.out.println(".I am "+age+" years old.");
		}
	}


