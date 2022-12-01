package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		
		set.add("Atarplus");
		set.add(" ");
		set.add("Colors");
		set.add("Zee");
		set.add(null);
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		

		set1.add("d");
		set1.add("a");
		set1.add("y");
		set1.add("z");
		set1.add("b");
		set1.add("x");
		set1.add(null);
		
		Iterator<String>itr1=set1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
