package saksham;

import java.util.Scanner;

public class date
{
    int date ;
    int month;
    int year;

    void  getInput() throws DateException
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Date : Month : Year");
        this.date=scan.nextInt();
        this.month=scan.nextInt();
        this.year=scan.nextInt();
        if(this.date>31||this.month>12||this.year>3000)
        {
            throw new DateException();
        }

    }
    void showDate()
    {
        System.out.println("Date :"+this.date+"/"+this.month+"/"+this.year);
    }

}
class DateException extends Throwable //checked Exception
{
    String getmessage()
    {
        return(" Date Exception Occured :");
    }
}
