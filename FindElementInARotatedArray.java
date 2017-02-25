public class FindElementInRotatedArray{
  
  public static int search(int arr[], int l, int r, int key)
  {
    if( l > r )
    {
      return -1;
    }
    
    int mid = (l+r)/2;
    
    if(arr[mid] == key)
    {
      return mid;
    }
  
    if(arr[l] <= arr[mid])
    {
      if(key >= arr[l] && key <= arr[mid])
      {
        return search(arr,l,mid-1,key);
      }
      else
      {
        return search(arr,mid+1,r,key);
      }
    }
    
    if(key > arr[mid] && key<=arr[r])
    {
      return search(arr,mid+1,r,key);
    }
    
    return search(arr, l, mid-1, key);
    
  }
  
  
  public static void main(String args[])
  {
     int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
     int size = arr.length;
    
     int i = search(arr, 0, size-1, 6);
     if(i!=-1)
     {
       System.out.println(i);
     }
     else
     {
       System.out.println("Key not found");
     }
  }
}
