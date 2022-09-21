package com.bridgelabz.linecomparision;

import java.util.Scanner;
/*As a fan of geometry, I want to model a line based on a point
consisting of (x, y) co-ordinates using the Cartesian system,So that I can calculate its length.
- A Length as 2 Points (x1, y1) and (x2, y2)
- Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2*/
public class CalculateLength {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter first co-ordinates x1 and Y1");

        double x1 = i.nextDouble();
        double y1 = i.nextDouble();

        System.out.println("Enter second co-ordinates x2 and y2");
        double x2 = i.nextDouble();
        double y2 = i.nextDouble();
        System.out.println("Length of a line is " + CalculateLength.lengthOfLine(x1, x2, y1, y2));
        i.close();
    }

    public static double lengthOfLine(double x1, double x2, double y1, double y2) {
        double form = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        return form;
    }
}

