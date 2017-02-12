import java.lang.Math;
public class minSubArray 
{
  
  public static int A[] = {2,3,1,2,4,3};
  
  
    public static void main(String args[]) {
             
       int number = MinSubArrayUsingBinarySearch(7, A); 
       System.out.println(number);
    }
      
    public static int MinSubArrayUsingBinarySearch(int s, int[] A)
    {
      if(null == A || A.length == 0)
        return 0;
      
      int min = A.length + 1;
      int[] sum = new[A.length+1]();
      for( int i = 0; i < A.length; i++)
      {
        sum[i+1] = sum[i] + A[i];
        if(sum[i+1] >= s)
        {
          int left = binarySearch(sum, sum[i+1] - s, 0, i+1)
          min = Math.min(min, i+1 - left)          
        }
      }
      return min == A.length +1 ? 0 : min;
    }
  
    public static int binarySearch(int[] sum, int target, int start, int end)
    {
      	while(start+1 < end)
        {
          int mid = start + (end - start)/2;
          if(A[mid] > = target)
          {
            end = mid;
          }
          else
          {
            start = mid;
          }
        }
      
      if(A[end] < target)
      {
        return end;
      }
      else
      {
        return start;
      }
    }
              
  }
  
  //Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn’t one, return 0 instead.  

