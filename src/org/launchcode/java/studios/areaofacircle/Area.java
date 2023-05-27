package org.launchcode.java.studios.areaofacircle;

public class Area {
    public static void main (String[] args) {
        java.util.Scanner input;
        Double radiusOfCircle;
        Double pi = 3.14;
        Double areaOfCircle;


        input = new java.util.Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
        radiusOfCircle = input.nextDouble();

        areaOfCircle = radiusOfCircle * pi;
        System.out.println("The area of the rectangle is: " + areaOfCircle);








    }
}
