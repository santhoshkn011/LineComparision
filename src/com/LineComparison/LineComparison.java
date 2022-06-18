/*
    Calculation of length of two lines: line1 Points (x1, y1) and (x2, y2) and
    line2 Points (x4, y4) and (x4, y4)

    - Math is a built-in object that has properties and methods for mathematical constants and functions.
      It's not a function object.
    - Java equals() Method. The equals() method of the Object class compare the equality of two objects.
      The two objects will be equal if they share the same memory address.
    - A Wrapper class is a class whose object wraps or contains primitive data types.
    - The Java String class compareTo() method compares the given string with the current string lexicographically.
      It returns a positive number, negative number, or 0.
*/

package com.LineComparison;

public class LineComparison {
    public static void main(String args[]) {
        //Welcome Message.
        System.out.println("Welcome to the Bridgelabz, let's begin with Line comparison computation.");

        //Variable declarations for line1, Points (x1, y1) and (x2, y2).
        int x1 = 2;
        int x2 = 10;
        int y1 = 6;
        int y2 = 14;

        /*
        Two Points (x1, y1) and (x2, y2).
        Length of a line1 = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2).
        */

        //Calculating the length of line1.
        int l1 = (int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));  //TypeCasting and Java sqrt() method.
        System.out.println("Length of line1: " + l1 + " units.");

        //Variable declarations for line2, Points (x3, y3) and (x3, y3).
        int x3 = 3;
        int x4 = 10;
        int y3 = 7;
        int y4 = 21;

        /*
        Two Points (x3, y3) and (x4, y4).
        Length of a line2 = sqrt( (x4 - x3) ^ 2 + (y4- y3) ^ 2).
        */

        //Calculating the length of line2.
        int l2 = (int)Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3)); //TypeCasting
        System.out.println("Length of line2: " + l2 + " units.");

        //Checking if the length of two lines are equal (Using Java equals Method).

        Integer length1 = l1; //Converting int to Integer (Wrapper Class), So that we can compare using equals method.
        Integer length2 = l2;
        
        boolean check = length1.equals(length2);  //Using Java equals method.
        
        if(check == true) {
            System.out.println("Length of two lines are equal.");
        }
        else {
            System.out.println("Length of two lines are not equal.");
        }

        //Comparing two lines, if one line is greater than, less than or equal to the other line(Using compareTo Method).

        int comp = length1.compareTo(length2); //Using compareTo method.

        if(comp > 0) {
            System.out.println("length of line1 is greater than line 2.");
        }
        else if(comp < 0) {
            System.out.println("length of line1 is less than line2.");
        }
        else {
            System.out.println("length of line1 is equal to line 2.");
        }
    }
}
