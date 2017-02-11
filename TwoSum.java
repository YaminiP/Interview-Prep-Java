import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class TwoSumExample {
  
  public static HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
  
    public static void main(String args[]) {
             
      	Add(1);
        Add(3);
        Add(5);
      	boolean answer = Find(4);
        System.out.println(answer);
      	boolean answer2 = Find(7);
        System.out.println(answer2);
      
    }
      
    public static void Add(int number)
    	{
        	if(elements.containsKey(number))
        	{
            	elements.put(number, elements.get(number)+1);
        	}	
        	else
        	{
            	elements.put(number,1);
        	}
    	}
  
  	public static boolean Find(int value)
    {
        for(Integer i : elements.keySet())
        {
            int target = value - i;
            if(elements.containsKey(target))
            {
                if(i==target && elements.get(target) < 2)
                {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}   
  
  
    
    

