package reverseSentence;

public class reverse {
	
	    public static void main(String[] args){
	    	 String s[] = "I am new to Java programming".split(" "); 
	         String result = ""; 
	         for (int i=s.length-1;i>=0;i--){
	        	 result += s[i] + " ";
	        	 } 
	         System.out.println(result); 
	       }
	    }
	  

