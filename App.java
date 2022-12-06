package mavenProject.reverse_string;

/**
 * Hello world!
 *
 */
public class App 
{
    public static  String findReverse( String word ) {
    String newName="";
	for(int i=word.length()-1;i>=0;i--)
	{
		char value=word.charAt(i);
		newName+=value;
	}
	return newName;
    }
}
