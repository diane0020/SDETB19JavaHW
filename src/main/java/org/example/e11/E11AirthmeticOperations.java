package org.example.e11;

public class E11AirthmeticOperations {
    public static void main(String[] args) {

        int widthRectangle = 5;
        int heightRectangle = 8;
        int perimeterRectangle;
        int areaRectangle;

       // Output: The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __

        // Perimeter operation
        perimeterRectangle = 2 * (widthRectangle+heightRectangle);

        // Area of a rectangle
        areaRectangle = widthRectangle * heightRectangle;

        System.out.print("The perimeter of a rectangle with width " + widthRectangle + " and height " + heightRectangle +
                " is equals to " + perimeterRectangle + " and the area equals to " + areaRectangle);


    }
}
