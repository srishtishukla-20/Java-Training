package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s1=new ArrayList<String>();
		ArrayList<String> s2=new ArrayList<String>();
		s1.add("Srishti");
		s1.add("Navneet");
		s1.add("Amrit");
		s1.add("Yuvi");
		s1.add("Swati");
		s2.add("");
		s2.add("");
		s2.add("");
		Collections.sort(s1,Collections.reverseOrder());
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		Collections.sort(s2,Collections.reverseOrder());
		Collections.copy(s2,s1);
		Iterator<String> itr1=s2.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		

	}

}
