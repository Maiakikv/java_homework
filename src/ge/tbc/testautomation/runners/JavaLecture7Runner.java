package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.figures.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.realizationClasses.CircleRealization;

public class JavaLecture7Runner {
    public static void main(String[] args) {
        Circle cir1 = new Circle(5);

        CircleRealization r = new CircleRealization();

        Circle cir2 = r.returnDoubleSizedCircle(cir1);
        Circle cir3 = r.returnCustomSizedCircle(cir1, 3);

        System.out.println(r.validateCircle(cir1));
        System.out.println(cir1.getArea());
        System.out.println(cir1.getPerimeter());
        System.out.println(cir2.getRadius());
        System.out.println(cir2.getPerimeter());
        System.out.println(cir2.getArea());
        System.out.println(cir3.getRadius());
        System.out.println(cir3.getPerimeter());
        System.out.println(cir3.getArea());


        r.returnDoubleSizedCircle(cir1).printPackageName();
        r.returnCustomSizedCircle(cir1, 3).printPackageName();



    }
}
