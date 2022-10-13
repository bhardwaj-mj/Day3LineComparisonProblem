package com.bridgelabz;

public class LineComparisonProblem {
    int calculateLength(int x1, int y1, int x2, int y2){
        int length=(int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }
    public static void main(String[] args) {
        LineComparisonProblem length=new LineComparisonProblem();
        Integer lengthOfLine1=length.calculateLength(8,8,4,5);
        Integer lengthOfLine2=length.calculateLength(18,14,10,8);
        System.out.println("Length of first line is ->"+lengthOfLine1);
        System.out.println("Length of Second line is ->"+lengthOfLine2);
        if(lengthOfLine1.equals(lengthOfLine2)==true){
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
        if(lengthOfLine1.compareTo(lengthOfLine2)==0){
            System.out.println("Both the lines are equal");
        }
        else if (lengthOfLine1.compareTo(lengthOfLine2)==1) {
            System.out.println("First line is larger then second line");
        }
        else {
            System.out.println("First line is smaller then the second line");
        }
    }
}
