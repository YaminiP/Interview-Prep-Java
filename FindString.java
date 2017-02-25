public class FindGivenString{
  
  
  public static int  search(String s[], String str, int first, int last)
  {
		while (first <= last) {
		// Ensure there is something at the end
		while (first <= last && s[last] == "") {
		--last;
		}
          
        if (last < first) {
         return -1; // this block was empty, so fail
        }
    
        int mid = (first + last)/2;
        while(s[mid] == ""){
        ++mid;
        }
    
       int r = s[mid].compareTo(str);
          
       if(r==0)
       {
         return mid;
       }
    
       if(r <0 )
       {
         first = mid+1;
       }
       else
       {
          last = mid -1;
       }       
     }
   return -1;
}
  
  
  
  
  public static int search(String s[], String str)
  {
    if(s== null || str == null)
    {
      return -1;
    }
    
    if(str == "")
    {
      for(int i=0; i< s.length-1;i++)
      {
        if(s[i]=="")
        {
          return i;
        }
      }     
    }
    
    return search(s, str, 0, s.length-1);
  }
  
  
  
  public static void main(String args[])
  {
    String s[]=new String[]{"at", "","", "", "ball", "","", "car", "", "", "dad", "",""};
    int i = search(s,"ball");
    System.out.println(i);
  }
  
  
  
}
