package saksham;

import java.sql.Time;

public class Main {

    public static void main(String[] args)  {
        {
      date d=new date();
      try
      {
        d.getInput();
         d.showDate();
      }
      catch(DateException e)
      {
         System.out.println(e.getmessage());
         e.printStackTrace();
      }
            time t = new time();
            t.getInput();
            t.showTime();

        }
    }
}