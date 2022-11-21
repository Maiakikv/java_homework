package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.generics.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


public class Lecture10Runner {
    public static void main(String[] args) {
        AnyPair any = new AnyPair<>(5, 6);
        AnyPair any2 = new AnyPair<>("aaa", "bbb");

        AnyPair<Field[], Field[]> anyPair = getDeclaredFields(any, any2);
        System.out.println(Arrays.asList(anyPair));
        System.out.println(anyPair.getElementOne());
        System.out.println(anyPair.getElementTwo());


        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 5);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);
        System.out.println(figurePair);

    }

    public static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        return new AnyPair<>(objOne.getClass().getFields(), objTwo.getClass().getFields());
    }

}

