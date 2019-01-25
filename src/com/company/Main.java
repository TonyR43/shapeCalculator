package com.company;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Please enter a letter to choose a shape.");
        System.out.println("Enter C for circle, S for square, and R for rectangle.");

        java.util.Scanner input = new java.util.Scanner(System.in);
        char shape = input.next().charAt(0);

        switch (shape)
        {
            case 'C':
            case 'c':
                System.out.println("Please enter the radius.");
                double cRadius = input.nextDouble();
                cirCal(cRadius);
                break;
            case 'S':
            case 's':
                System.out.println("Please enter the length.");
                double sSideA = input.nextDouble();
                System.out.println("Please enter the height.");
                double sSideB = input.nextDouble();
                sqCal(sSideA, sSideB);
                break;
            case 'R':
            case 'r':
                System.out.println("Please enter the length");
                double rSideA = input.nextDouble();
                System.out.println("Please enter the height.");
                double rSideB = input.nextDouble();
                recCal(rSideA, rSideB);
                break;
            default:
                System.out.println("Invalid entry.");
                System.out.println("Please enter a letter to choose a shape.");
                System.out.println("Enter C for circle, S for square, and R for rectangle.");
                shape = input.next().charAt(0);
        }

    }

    private static void cirCal(double cRadius)
    {

        cirCirc(cRadius);
        cirAr(cRadius);
    }

    private static void cirCirc(double cRadius)
    {
        double circumference = 2 * (3.14 * cRadius);
        System.out.println("The circumference is: " + circumference);
    }

    private static void cirAr(double cRadius)
    {
        double area = 2 * (3.14 * Math.pow(cRadius, 2));
        System.out.println("The area is: " + area);
    }

    private static void sqCal(double sSideA, double sSideB)
    {
        sqPer(sSideA, sSideB);
        sqAr(sSideA, sSideB);
    }

    private static void sqPer(double sSideA, double sSideB)
    {
        double perimeter = (2 * sSideA) + (2 * sSideB);
        System.out.println("The perimeter is: " + perimeter);
    }

    private static void sqAr(double sSideA, double sSideB)
    {
        double area = sSideA * sSideB;
        System.out.println("The area is: " + area);
    }

    private static void recCal(double rSideA, double rSideB)
    {
        recPer(rSideA, rSideB);
        recAr(rSideA, rSideB);
    }

    private static void recPer(double rSideA, double rSideB)
    {
        double perimeter = (2 * rSideA) + (2 * rSideB);
        System.out.println("The perimeter is: " + perimeter);
    }

    private static void recAr(double rSideA, double rSideB)
    {
        double area = rSideA * rSideB;
        System.out.println("The area is: " + area);
    }
}
