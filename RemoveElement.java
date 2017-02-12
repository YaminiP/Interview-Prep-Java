//Given an array and a value, remove all instances of that value in place and return the new length. 

public class RemoveElement
{

  public static int[] A = { 1,2,4,4,5};
  
  public static void main(String args[])
  {
    int result = RemoveElementInArray(A, 4);
    System.out.println(result);
    
  }
  
  public static int RemoveElementInArray(int[] A, int elem)
  {
    int size = A.length;
   
    int i =0;
    for(int j=0;j<size;j++)
    {
      if(A[j]!= elem)
      {
        A[i] = A[j];
        i++;
      }
    }
    
    return i;
  }
}
