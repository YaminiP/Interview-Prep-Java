public class Power
{
  public static int power (int x, int y)
  {
    if(y==0)
    {
      return 1;
    }
    
    int temp = power(x,y/2);
    if(y%2==0)
    {
      return temp * temp;
    }
    else
    {
      return x * temp * temp;
    }
  }
  
  //extended version that works with float and negative values
  public static float power2(float x, int y)
  {
    if(y==0)
    {
      return 1;
    }
    
    float temp = power2(x,y/2);
    if(y%2==0)
    {
      return temp*temp;
    }
    else
    {
      if(y>0)
      {
        return x * temp * temp;
      }
      else
      {
        return (temp * temp) / x ;
      }
    }
    
      
  }
  
  public static void main(String[] args)
  {
    int x = power(2,3);
    float a =2;
    int b = -3;
    float y = power2(a,b);
    System.out.println(x);
    System.out.println(y);
  }
}

//Complexity is: O(log n)
