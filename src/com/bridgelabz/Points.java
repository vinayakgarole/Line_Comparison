package com.bridgelabz;

import java.util.Scanner;

public class Points {

    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public void getPoints() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point x");
        setX(sc.nextInt());
        System.out.println("Enter Point y");
        setY(sc.nextInt());
    }
}
