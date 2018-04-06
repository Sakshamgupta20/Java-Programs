package com.saksham;

public class mystring {
    String x;

    mystring(String x)

    {
        this.x = x;
    }


    public static void swap(mystring x1, mystring y1) {
        String temp;
        temp = x1.x;
        x1.x = y1.x;
        y1.x = temp;
        System.out.println("String after swap are-----");
        System.out.println(x1.x + "," + y1.x);
    }

    public static void concat(mystring x1, mystring y1) {
        String x3;
        x3 = x1.x.concat(y1.x);
        System.out.println("String after concat are-----");
        System.out.println(x3);
    }

}
