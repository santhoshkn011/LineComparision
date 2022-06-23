/*
    Calculation of length of two lines: line1 Points (x1, y1) and (x2, y2) and
    line2 Points (x4, y4) and (x4, y4)
    Length of a line1 = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2).

    - Math is a built-in object that has properties and methods for mathematical constants and functions.
      It's not a function object.
    - Java equals() Method. The equals() method of the Object class compare the equality of two objects.
      The two objects will be equal if they share the same memory address.
    - A Wrapper class is a class whose object wraps or contains primitive data types.
    - The Java String class compareTo() method compares the given string with the current string lexicographically.
      It returns a positive number, negative number, or 0.
*/
package com.LineComparison;
import java.util.Scanner; //Importing Scanner class.
public class LineComparison {
    public static int a, b, c, d, length1, length2;
    public static Integer lg1, lg2;
    //Method for points input
    public static void linePoints() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
    }
    //Method to find length of line
    public static int lengthOfLine(){
        int length = (int) Math.sqrt((b - a) * (b - a) + (d - c) * (d - c));
        return length;
    }
    //Method: Checking using Java Equals
    public static void lineCheckEquals(){
        boolean check = lg1.equals(lg2);  //Using Java equals method.
        if (check == true) {
            System.out.println("Length of two lines are equal.");
        } else {
            System.out.println("Length of two lines are not equal.");
        }
    }
    //Method: Checking using CompareTo
    public static void lineCheckCompareTo(){
        int comp = lg1.compareTo(lg2); //Using compareTo method.
        if (comp > 0) {
            System.out.println("length of line1 is greater than line 2.");
        } else if (comp < 0) {
            System.out.println("length of line1 is less than line2.");
        } else {
            System.out.println("length of line1 is equal to line 2.");
        }
    }
    public static void main(String args[]) {
        //Welcome Message.
        System.out.println("Welcome to the Bridgelabz, let's begin with Line comparison computation.");
        //line1 details:
        System.out.println("Enter the points of line1 (x1, y1) and (x2, y2): ");
        linePoints(); //invoking to enter line1 points
        //Calculating the length of line1.
        LineComparison l1 = new LineComparison(); //creating object
        length1 = l1.lengthOfLine(); //invoking length of line
        System.out.println("Length of line1: " + length1 + " units.\n");
        //line2 details:
        System.out.println("Enter the points of line2 (x3, y3) and (x4, y4): ");
        linePoints();
        //Calculating the length of line1.
        LineComparison l2 = new LineComparison();
        length2 = l2.lengthOfLine();
        System.out.println("Length of line2: " + length2 + " units.\n");
        lg1 = length1; //Converting int to Integer (Wrapper Class), So that we can compare using equals method.
        lg2 = length2;
        //Checking if the length of two lines are equal (Using Java equals Method).
        lineCheckEquals();
        //Comparing two lines, if one line is greater than, less than or equal to the other line(Using compareTo Method).
        lineCheckCompareTo();
    }
}
