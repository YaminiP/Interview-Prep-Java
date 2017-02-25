public class FindElementInSortedMatrix{
 
  public static int search(int[][] a, int n,int key)
  {
    int i =0;
    int j = n-1;
    
    while( i< n && j >= 0)
    {
      if(a[i][j] == key)
      {
        System.out.println(i + " \n");
        System.out.println(j);
        
        return 1;
      }
      if( a[i][j] > key)
      {
        j--;
      }
      else
      {
        i++;
      }
    }
    
    System.out.println("Not found");
    return 0;
  }
  
  public static void main(String args[])
  {
    int mat[][] =  new int[][]{ {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50},
                  };
    search(mat,4,29);
  }
}
