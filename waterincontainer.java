//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordi- nate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.
import java.lang.Math;
public class WaterInContainer
{

  public static int[] A = {1,2,3,2,3,2,4,2};
  
  public static void main(String args[])
  {
   int result = FindMaxArea(A);  
   System.out.println(result);
  }
  
  public static int FindMaxArea(int[] A)
  {
    int left = 0;
    int max = 0;
    int right = A.length - 1;
    
   while(left < right)
   {
     max = Math.max(max, ((right - left) * Math.min(A[left], A[right])));
     if(A[left] < A[right])
     {
       left++;
     }
     else
     {
       right--;
     }
   }
    
    return max;
    
  }
}
