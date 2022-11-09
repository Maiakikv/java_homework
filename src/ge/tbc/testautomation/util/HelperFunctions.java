package ge.tbc.testautomation.util;

import ge.tbc.testautomation.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle x, Rectangle y) {
        if (x.getPerimeter() > y.getPerimeter()) {
            System.out.println("parameter 1 > parameter 2");
        } else if (x.getPerimeter() == y.getPerimeter()) {
            System.out.println("parameter 1 = parameter 2");
        } else System.out.println("parameter 1 < parameter 2");
    }
}
