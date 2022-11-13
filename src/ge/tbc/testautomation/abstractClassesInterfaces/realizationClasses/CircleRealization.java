package ge.tbc.testautomation.abstractClassesInterfaces.realizationClasses;

import ge.tbc.testautomation.abstractClassesInterfaces.figures.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;

public class CircleRealization implements IResizableCircle, IValidCircle {

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        return new Circle(circle.getRadius() *2);

    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        return new Circle(circle.getRadius() * byvValue);

    }

    @Override
    public boolean validateCircle(Circle circle) {
        if (circle.getRadius() > 0) {
            return true;
        } else return false;
    }


}
