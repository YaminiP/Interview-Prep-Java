public class MergeTwoArrays{
  
  public static int A[] = new int[10];

  
  
  
  public static int [] B = {3,4,5,6};
  
  
  public static void main (String[] args)
  {
      A[0] = 1;
  A[1] = 2;
  A[2] = 3;
  A[3] = 4;
     int m = 4;
     int n = B.length;
     merge(A,m,B,n);
    for(int i =0; i< A.length; i++)
    {
      System.out.println(A[i]);
    }
  }
  
    public static void merge(int A[], int m, int B[], int n) {
      while(m > 0 && n > 0){
         if(A[m-1] > B[n-1]){
            A[m+n-1] = A[m-1];
				m--; }else{
            A[m+n-1] = B[n-1];
				n--; }
}
      while(n > 0){
         A[m+n-1] = B[n-1];
         n--;
} }

  
}
