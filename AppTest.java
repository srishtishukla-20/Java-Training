package example.hello.my_first_system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testfindMax() {
		assertEquals(78,App.findMax(new int[] {23,67,78,43} ));
		//asserEquals takes 2 parameters, your expected value and the elements	
	}

}
