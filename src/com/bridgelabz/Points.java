package com.bridgelabz;

import java.util.Scanner;

public class Points {

    private double x1, y1, x2, y2;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void getPoints() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point x1: ");
        setX1(sc.nextInt());
        System.out.println("Enter Point y1: ");
        setY1(sc.nextInt());
        System.out.println("Enter Point x2: ");
        setX2(sc.nextInt());
        System.out.println("Enter Point y2: ");
        setY2(sc.nextInt());
    }
}
