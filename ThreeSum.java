public class ThreeSum {
  
  public static int A[] = { -4, -1,-1,0,1,1};
  
  
    public static void main(String args[]) {
             
        int arr_size = A.length;
      
        FindTriplet(A,arr_size,0); 
    }
      
    public static boolean FindTriplet(int A[], int arr_size, int sum)
    {
      
      for(int i=0; i< arr_size-2; i++)
      {
        int l = i+1;
        int r = arr_size - 1;
        
        while(l < r)
        {
          	if( A[i] + A[l] + A[r] == sum)
          	{
            	System.out.print("Triplet is " + A[i] + " ," + A[l]
                            + " ," + A[r]);
                    return true;
          	}
          	else if (A[i] + A[l] + A[r] < sum)
          	{
            	l++;
          	}	
          	else if (A[i] + A[l] + A[r] > sum)
          	{
            	r--;
          	}
        }        	
       }
      return false;
	}   
  
 // The complexity is O(n^2) as we have taken a sorted array
 // If the array was not sorted, the complexity would be 0(n^3) including the sorting complexity
}   
    
