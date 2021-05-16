
public class VowelOrNot
{		
		// Program that uses Regular expressions
			//to see if there's are vowel in the string
  public static void main(String[] args)
  {
    System.out.println(VoCon("htllt"));
  }
  public static boolean VoCon(String in)
  {
    return in.toLowerCase().matches(".*[aeiou].*");
  }
} 