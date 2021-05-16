public class RmWhiteSpace
{      
	// The PROGRAM is for removing the whitespaces of a String
  public static void main(String[] args)
   {
    System.out.println(RmSpace("Hello My Friend"));
   }
  public static String RmSpace(String in)
   {
	StringBuilder obj =new StringBuilder();	
        char[] charArray = in.toCharArray();
	for(char c: charArray)
	 {
		if(!Character.isWhitespace(c))
		 {
	           obj.append(c);
		 }
       	  
	 }
	return obj.toString();
   }
   
} 
     