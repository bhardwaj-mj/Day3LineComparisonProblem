package com.bridgelabz;

import java.util.Scanner;

public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void getPoints() {
        Scanner inputPoints=new Scanner(System.in);
        x= inputPoints.nextInt();
        y= inputPoints.nextInt();
    }
}


