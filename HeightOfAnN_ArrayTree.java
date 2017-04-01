//Given an array which contains the parent of the ith element in the n-ary tree.Parent[i] = -1 for root. 
//Find the height of the tree.
//import java.util.*
public class FindHeightOfTree
{
  public static int a[] = {-1, 0, 1, 6, 6, 0, 0, 2, 7};
  public static int b[] = new int[9]; 
  
  
  public static void main(String[] args)
  {
    int j =-1;
    int max = 0;
    for(int i = 0; i < 9; i++)
    {
      b[i] = -1;      
    }
    
    for(int i =0; i < 9 ; i++)
    {
      getLevel(i);
    }
    
    for(int i = 0; i< 9; i++)
    {
      max = Math.max(b[i],j);
    }
    
    System.out.println(max);
  }
  
  public static void getLevel(int i)
  {
    if(a[i] == -1)
    {
      b[i]=0;
    }
    else if(b[a[i]]!= -1)
    {
      b[i] = b[a[i]] + 1 ;
    }
    else
    {
      getLevel(a[i]);
      b[i] = b[a[i]] + 1;
    }
  }
  
  
}
