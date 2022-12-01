package mapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map1= new HashMap();
		map1.put(1,"Srishti");
		map1.put(2, "Deepa");
		map1.put(3, "Shireen");
		map1.put(4, "Swati");
		map1.put(5,"Srishti");
		map1.put(6.8f, "Suhashi");
		map1.put(7.9f, "Suhani");
	
		
		Set set=map1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.print(entry.getKey()+"  "+entry.getValue());
		}
//		System.out.println(set);
		

	}

}
