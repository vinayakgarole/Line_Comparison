package com.bridgelabz;

public class Length {

    double length(double x1, double y1, double x2, double y2) {

        double result = Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
        return result;
    }
}
