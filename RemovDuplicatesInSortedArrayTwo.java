// Remove duplicates from a sorted array
//What if duplicates are allowed at most twice?

//For example, Given sorted array A = [1,1,1,2,2,3],

//Your function should return length = 5, and A is now [1,1,2,2,3].

public class RemoveDuplicatesTwo
{

  public static int[] A = { 1,1,1,2,2,3,};
  
  public static void main(String args[])
  {
    int result = RemoveDuplicatesInSortedArrayTwo(A);
    System.out.println(result);
  }
  
  public static int RemoveDuplicatesInSortedArrayTwo(int[] A)
  {
    int size = A.length;
    
    int prev = 1;
    int curr = 2;
    
    while(curr < size)
    {
      if( A[curr]== A[prev] && A[curr]== A[prev-1])
      {
        curr++;
      }
      else
      {
        prev++;
        A[prev] = A[curr];
        curr++;
      }
    }
    
    return prev + 1;
  }
}
