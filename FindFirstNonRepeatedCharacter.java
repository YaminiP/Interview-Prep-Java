import java.util.HashMap;


public class FindFirstNonRepeating
{
  
  public static Character firstNonRepeatedCharacter(String str)
  {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    
    int length = str.length();
    Character c;
    for(int i =0;i<length;i ++)
    {
      c = str.charAt(i);
      if(map.containsKey(c))
      {
        map.put(c,map.get(c)+1);
      }
      else
      {
        map.put(c,1);
      }
    }
    
    for(int j =0 ; j < length; j++)
    {
      c = str.charAt(j);
      if(map.get(c) == 1)
      {
        return c;
      }
    }
    
    return null;
  }
  
  public static void main(String args[])
  {
    String str = "GeeksForGeeks";
    
    Character c = firstNonRepeatedCharacter(str);
    System.out.println(c);
  }
}
