//Given an array nums, write a function to move all 0’s to the end of it while maintaining the relative order of the non-zero elements.
//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

public class MoveZeros
{

  public static int[] A = {0,0,0,1,2,3};//{ 0, 1, 0, 3, 12};
  
  public static void main(String args[])
  {
    MoveZerosToEnd(A);    
  }
  
  public static void MoveZerosToEnd(int[] A)
  {
    int size = A.length;
   
    int i=0;
    int j=0;
    while(j < size)
    {
      if(A[j]==0)
      {
        j++;
      }
      else
      {
        A[i]=A[j];
        System.out.println(A[i] + ",");
        i++;
        j++;
      }
    }
    
    while(i < size)
    {
      A[i] = 0;
      System.out.println(A[i] + ",");
      i++;
    }        
  }
}
