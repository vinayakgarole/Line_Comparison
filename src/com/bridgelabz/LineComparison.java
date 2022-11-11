package com.bridgelabz;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        Points point = new Points();
        Length line = new Length();

        System.out.println("Enter points for First line:\n");
        point.getPoints();

        Double length1 = line.length(point.getX1(), point.getY1(), point.getX2(), point.getY2());
        System.out.println("Length of line 1 is: " + length1);

        System.out.println("\nEnter points for second line:");
        point.getPoints();

        Double length2 = line.length(point.getX1(), point.getY1(), point.getX2(), point.getY2());
        System.out.println("Length of line 2 is: " + length2);
        System.out.println("--------------------------------");

        if (length1.equals(length2)) {
            System.out.println("Lines are equal");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("Line 2 is greater than Line 1");
        }
    }
}
