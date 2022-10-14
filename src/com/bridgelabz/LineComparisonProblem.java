package com.bridgelabz;

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation problem");
        Line line1=new Line();
        System.out.println("Enter the points of line1->");
        line1.pointsInput();
        Line line2=new Line();
        System.out.println("Enter the points of line2->");
        line2.pointsInput();
        System.out.print("Length of line1 is =>");
        System.out.println(line1.getLengthOfLine());
        System.out.print("Length of line2 is =>");
        System.out.println(line2.getLengthOfLine());
        Line.compareByEquals(line1,line2);
        Line.compareByCompareTo(line1,line2);

    }
}
