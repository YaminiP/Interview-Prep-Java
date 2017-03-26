//Given a string, determine if it is a palindrome, considering only alphanumeric charac- ters and ignoring cases.
//For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.
public class ValidPalindrome
{
  
  public static boolean isValid(String s)
  {
    if( s == null || s.length() == 0)
    {
      return false;
    }
    
    s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    System.out.println(s);
    
    for(int i = 0; i< s.length(); i++)
    {
      if(s.charAt(i)!= s.charAt(s.length()-1-i))
      {
        return false;
      }
    }
    return true;
  }
  
  
  public static void main(String[] args)
  {
    String str = "A man, a plan, a canal: Panama";
    //String str = "ProgramCreek is awesome";
    System.out.println(isValid(str));              
  }
}
