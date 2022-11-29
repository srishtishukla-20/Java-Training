package arraylistDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList list=new ArrayList();
			list.add("database");
			list.add(58);
			list.add('%');
			list.add(5.8f);
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
//			for(int i=0;i<list.size();i++)
//			{
//				System.out.println(list.get(i));
//			}

	}

}
