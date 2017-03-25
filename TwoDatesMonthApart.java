public class OneMonthApart{
  
  public static boolean monthApart(int monthOne, int dayOne, int monthTwo, int dayTwo)
  {
    int monthDays = -1;
    int monthMin = Math.min(monthOne, monthTwo);
    
    if( monthOne < 1 || monthOne > 12 || monthTwo < 1 || monthTwo > 12)
    {
      return false;
    }
    
    switch(monthMin)
    {
      case 1:
      	monthDays = 31;
      	break;
      case 2:
      	monthDays = 28;
      	break;
      case 3: 
        monthDays = 31;
      	break;
      case 4:
      	monthDays = 30;
        break;
      case 5:
        monthDays = 31;
        break;
      case 6:
        monthDays = 30;
        break;
      case 7:
      	monthDays = 31;
        break;
      case 8:
      	monthDays = 31;
      	break;
      case 9:
      	monthDays = 30;
        break;
      case 10:
      	monthDays = 31;
        break;
      case 11:
      	monthDays = 30;
        break;
      case 12:
        monthDays = 31;
        break;
    }
    
    int dayFirst = -1;
    int daySecond = -1;
    if(monthOne < monthTwo)
    {
      dayFirst = dayOne;
      daySecond = dayTwo;
    }
	else if( monthTwo < monthOne)
    {
      dayFirst = dayTwo;
      daySecond = dayOne;
    }
    
    if(Math.abs(monthOne - monthTwo) > 1 )
    {
      return true;
    }
    else if((monthOne - monthTwo) == 0)
    {
      return false;
    }
    else if(Math.abs(monthOne - monthTwo) == 1)
    {
      if(((monthDays - dayFirst) + daySecond ) < monthDays)
      {
        return false;
      }
      else
      {
        return true;
      }
    }
    return false;
  }
  
  public static void main(String[] args)
  {
    boolean n = monthApart(7,7,6,8);
    System.out.println(n);
  }
  
  
  
}
