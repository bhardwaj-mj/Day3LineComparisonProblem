package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProblem {
    static int calculateLength(int x1, int y1, int x2, int y2){
        System.out.println("Points of the line are => ("+x1+","+y1+") and ("+x2+","+y2+")");
        int length=(int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X coordinates of the line ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.print("Enter the Y coordinates  of the line ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int result = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of line is " + result);
    }
}
