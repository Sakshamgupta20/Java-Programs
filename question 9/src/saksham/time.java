package saksham;

import java.util.Scanner;

class time
{
    int hour;
    int min;
    int sec;

    void  getInput()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Hour : Minute : Seconds");
        this.hour=scan.nextInt();
        this.min=scan.nextInt();
        this.sec=scan.nextInt();
        try
        {
            if(this.hour>24||this.min>60||this.sec>60)
            {
                throw new TimeException();
            }
        }
        catch(TimeException e)
        {
            System.out.println(e.getmessage());
            e.printStackTrace();
        }

    }
   void showTime()
    {
        System.out.println("Time :"+this.hour+"/"+this.min+"/"+this.sec);
    }

}
class TimeException extends RuntimeException //unchecked Exception
{
    String getmessage()
    {
        return(" Time Exception Occured ");
    }
}

