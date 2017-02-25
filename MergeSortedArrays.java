import java.util.*;
import java.lang.*;
import java.io.*;

public class MergeSortedArrays{
  
  public static void sort(int a[], int b[], int m, int n)
  {
    int total = m+n-1;
    int newM = m -1;
    int newN = n-1;
    
    while(newM >=0 && newN >=0)
    {
      if(a[newM] > b[newN])
      {
        a[total--] = a[newM--];
      }
      else if (b[newN] > a[newM])
      {
        a[total--] = b[newN--];
      }
    }
  }
    
    public static void main (String[] args)
    {
		
		int[] a = new int[10];
		int j = 1;
		for(int i = 0; i<5; i++)
		{
			a[i] = j;
			j+=2;
		}
		int[] b = {2,4,6,8,10};
		sort(a,b,5,b.length);
		
		System.out.println(Arrays.toString(a));
		
	}
  }
