package ge.tbc.testautomation.annotationsAndComparators;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle a, Rectangle b) {
        return Double.compare(b.getArea(), a.getArea());
    }
}
