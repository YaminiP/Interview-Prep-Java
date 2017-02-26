import java.lang.*;

public class PrintMissingAndRepeating{
  
  public static void PrintMissingAndRepeatingElement(int arr[], int size)
  {
     System.out.println("\n The repeating element is");
 
    for(int i = 0; i < size; i++)
    {
        if(arr[Math.abs(arr[i])-1] > 0)
        {
          arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
        }        
        else
        {          
            System.out.println(Math.abs(arr[i]));
        }
    }
    
    System.out.println("\nand the missing element is ");
    for(int i=0; i<size; i++)
    {
        if(arr[i]>0)
        {
            System.out.println(i+1);
        }
    }
  }
  
  
  public static void main(String args[])
  {
    int arr[] = {7, 3, 4, 5, 5, 6, 2};
    int  n = arr.length;
    PrintMissingAndRepeatingElement(arr, n);
  }
}
