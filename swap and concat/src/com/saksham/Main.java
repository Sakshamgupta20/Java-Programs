package com.saksham;

/*Design a class MyString with a String as data member. Design a constructor to read the input string. Add the following functionalities in the
class: concatenate() – to concatenate the strings of two instances; exchange() – to swap the strings of two instances.
Write a display method to show the content of the string of an object. Write suitable main method.*/

public class Main {

    public static void main(String[] args)
    {
       mystring c2 = new mystring("hello");
        mystring c1 = new mystring("world");
        System.out.println("Strings are-----");
        System.out.println(c1.x+","+c2.x);

        mystring.swap(c1,c2);
        mystring.concat(c1,c2);
    }

}
