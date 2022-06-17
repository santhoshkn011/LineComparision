/*
    Calculation of length of two lines: line1 Points (x1, y1) and (x2, y2) and
    line2 Points (x4, y4) and (x4, y4)

    - Math is a built-in object that has properties and methods for mathematical constants and functions.
      It's not a function object.
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
        int l1 = (int)Math.sqrt((x2-x1)*2 + (y2-y1)*2);  //TypeCasting and Java sqrt() method.
        System.out.println("Length of line1: " + l1 + " units");

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
        int l2 = (int)Math.sqrt((x4-x3)*2 + (y4-y3)*2); //TypeCasting
        System.out.println("Length of line2: " + l2 + " units");
    }
}
