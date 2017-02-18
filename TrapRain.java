//import java.lang.Math;
public class TrapRain
{

  public static int A[] = {0,1,2,1,0,1,3,2,1,2,1};
  
  public static void main(String args[])
  {
   int result = trap(A);  
   System.out.println(result);
  }
  
  public int trap(int[] A)
  {
    int left[] = new[A.length-1];
    int right[] = new[A.length -1];
    
    int max=0;
    
    left[0] = A[0];
    for(int i=1;i<length-1;i++)
    {
      if(left[i] < max)
      {
        left[i]=max;
      }
      else
      {
        left[i]=A[i];
        max= A[i];
        
      }
    }
    
    max = A[A.length -1];
    right[A.length-1] = A[A.length-1];
    for(int j=A.length-1;j>=0;j--)
    {
      if(right[j]<max)
      {
        right[j]=A[j];
      }
      else
      {
        right[j] = A[j];
        max = A[j];
      }
    }
    
    for(int k=0; k < A.length-1; k++)
    {
      int result += Math.min(left[k],right[k]) - A[k];
      
    }
    
    return result;
  }   
  
}
