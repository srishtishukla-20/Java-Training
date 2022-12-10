package mavenProject.reverse_string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
	@Test
	public void testfindReverse() {
		assertEquals("ilajna",App.findReverse(new String("anjali" )));
		//asserEquals takes 2 parameters, your expected value and the elements	
	}
}
