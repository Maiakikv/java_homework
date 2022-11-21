package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture9Runner {
    public static void main(String[] args) {
        Field[] fields = Analyzable.class.getDeclaredFields();


        for (Field field :
                fields) {
            VariableNameAnnotation[] annotations = field.getAnnotationsByType(VariableNameAnnotation.class);
            for (VariableNameAnnotation annotation :
                    annotations) {
                String x = annotation.name();
                String y = field.getName();
                if (x.equalsIgnoreCase(y)){
                    System.out.println(y);
                } else System.out.println("VARIABLE NAME MISMATCH FOUND.");
            }





        }


        @SuppressWarnings("unused")
        int b;
        @SuppressWarnings("unused")
        double a;

        List <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(14);
        list.add(45);
        list.add(2);
        list.add(0);
        list.add(87);
        list.add(11);
        list.add(7);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);

        List <Rectangle> rec = new ArrayList<>();
        rec.add(new Rectangle(5, 6));
        rec.add(new Rectangle(12, 9));
        rec.add(new Rectangle(2, 2.6));
        rec.add(new Rectangle(4, 2));
        rec.add(new Rectangle(1.1, 6.7));
        rec.add(new Rectangle(4.7, 7));
        rec.add(new Rectangle(9, 8));
        rec.add(new Rectangle(1.7, 3.6));
        rec.add(new Rectangle(5.8, 5.6));
        rec.add(new Rectangle(8, 2));

        rec.sort(new RectangleComparator());
        System.out.println(rec);




    }
}

