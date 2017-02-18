public class FindIncreasingSequences{
  
  public static int [] A = {0,1,2,4,5,7,8,10,14,15,17};
  
  public static void main (String[] args)
  {
     PrintIncreasingSequence(A);
    
  }
  
  public static void PrintIncreasingSequence(int[] A)
  {
    int size = A.length;
    
    int start = A[0];
    int j =1;
    for( int i =0; i< size ; i++)
    {
      
      if( i == size -1)
      {
       	if(start == A[i])
       	{
         	System.out.println(A[i]);
         	break;
       	}
       	else
       	{
         	System.out.println(start + "-> " + A[i]);
        	break;
       	}
      }
      
      if(A[j] == A[i] + 1)
      {
        j++;
      }
      else
      {
        if(start == A[i])
        {
          System.out.println(A[i]);          
        }
        else
        {
        System.out.println(start + "->" + A[i] + "\n");
        }
        start = A[j];
        j++;
        
      }
    }
  }
  
}
