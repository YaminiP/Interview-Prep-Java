// Remove duplicates from a sorted array

public class RemoveDuplicates
{

  public static int[] A = { 1,1,2,3,3};
  
  public static void main(String args[])
  {
    int result_size = RemoveDuplicatesInSortedArray(A);
    System.out.println(result_size);
  }
  
  public static int RemoveDuplicatesInSortedArray(int[] A)
  {
    int size = A.length;
    int j = 0;
    for( int i = 0; i< size; i++)
    {
      if(A[j]!=A[i])
      {
        A[++j] = A[i];
      }
    }
    
    return j+1;
  }
}
