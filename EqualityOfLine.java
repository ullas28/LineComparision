package com.bridgelabz.linecomparision;

import java.util.Scanner;

/*As a fan of geometry, I want to check equality of two lines based on the end points, So
that I know when two lines are the equal.
- Using Java equals method to check equality of 2 Lengths is preferable.*/

public class EqualityOfLine {
    public static void main(String[] args) {
        System.out.println("Enter the co-ordinates for line 1");
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, g, h;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        double line_1 = CalculateLength.lengthOfLine(a, b, c, d);
        System.out.println("Enter the co-ordinates for line 2");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        double line_2 = CalculateLength.lengthOfLine(a, b, c, d);
        String s1 = line_1 + "";
        String s2 = Double.toString(line_2);
        System.out.println(s1 + "\t" +s2);
        System.out.println(s1.equals(s2));
    }
}
