package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4.6, 6.6);
        Rectangle rec2 = new Rectangle(5, 7.8);
        Triangle triangle = new Triangle(4, 6, 4.8, 5);

        System.out.println(rec1.getArea());
        System.out.println(rec2.getArea());
        System.out.println(triangle.getArea());
        System.out.println(rec1.getPerimeter());
        System.out.println(rec2.getPerimeter());
        System.out.println(triangle.getPerimeter());

        HelperFunctions.compareRectangles(rec1, rec2);
    }
}
