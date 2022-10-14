package com.bridgelabz;

public class Line {
    Point point1=new Point();
    Point point2=new Point();
    public int getLengthOfLine() {
        int length = (int) Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
        return length;
    }
        public void pointsInput(){
            System.out.println("Enter the co-ordinates of point1->");
            point1.getPoints();
            System.out.println("Enter the co-ordinates of point2->");
            point2.getPoints();
        }
        public static void compareByEquals(Line line1,Line line2){
            Integer length1= line1.getLengthOfLine();
            Integer length2= line2.getLengthOfLine();
            if(length1.equals(length2)){
                System.out.println("Both lines are equal");
            }
            else{
                System.out.println("Lines are not equal");
            }
        }
        public static void compareByCompareTo(Line line1,Line line2){
            Integer length1= line1.getLengthOfLine();
            Integer length2= line2.getLengthOfLine();
            if(length1.compareTo(length2)==0){
                System.out.println("Line1 is equal to Line2");
            }
            else if(length1.compareTo(length2)==1){
                System.out.println("Line1 is greater then Line2");
            }
            else {
                System.out.println("Line1 is smaller then Line2");
            }
        }

}
