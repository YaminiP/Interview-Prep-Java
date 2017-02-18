public class FindShortestDistanceBtwWords{
  
  public static String[] words = {"practice", "makes", "perfect", "coding", "makes"};

  public static void main (String[] args)
  {  
    int min = ShortestDistance(words, "practice","coding");
    System.out.println(min);
  }
  
  public static int ShortestDistance(String[] words, String word1, String word2)
  {
    int m =-1;
    int n =-1;
    
    int min = Integer.MAX_VALUE;
    int size = words.length;
    
    for(int i = 0; i < size; i++)
    {
      String s = words[i];
      if(word1.equals(s))
      {
        m = i;
        if(n!=-1)
        {
          min = Math.min(min, m-n);
        }
      }
      else if(word2.equals(s))
      {
        n =i;
        if(m!=-1)
        {
          min = Math.min(min, n-m);
        }
      }
    }
    return min;
  }
  

  
}
