//The minute hand moves 360 degree in 60 minute(or 6 degree in one minute) and hour hand moves 360 degree in 12 hours(or 0.5 degree in 1 minute). 
//In h hours and m minutes, the minute hand would move (h*60 + m)*6 and hour hand would move (h*60 + m)*0.5.

public class HourMinAngle{
  
  public static double calcAngle(double h, double m)
  {
    if(h < 0 || m < 0 || h > 12 || m > 60)
    {
      return 0;
    }
    
    if(h == 12)
    {
      h = 0;
    }
    
    if(m == 60)
    {
      m = 0;
    }
    
    double hour_angle = (h*60 + m) * 0.5;
    double minute_angle = 6 * m;
    
    double angle = Math.abs(hour_angle - minute_angle);
    angle = Math.min(360-angle, angle);
    return angle;
  }
  
  public static void main(String[] args)
  {
    System.out.println(calcAngle(9,60));
    System.out.println(calcAngle(3,30));
  }
  
}
