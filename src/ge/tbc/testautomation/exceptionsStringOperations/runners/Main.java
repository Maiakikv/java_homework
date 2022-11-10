package ge.tbc.testautomation.exceptionsStringOperations.runners;

import ge.tbc.testautomation.exceptionsStringOperations.exceptions.LimitException;
import ge.tbc.testautomation.exceptionsStringOperations.exceptions.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperations.figures.Circle;

public class Main {

    public static void main(String[] args) {
        try {
            try {
                Circle circle1 = new Circle(-1.6);
            } catch (RadiusException e) {
                System.out.println(e.getMessage());
            }

            try {
                Circle circle2 = new Circle(-1.6);
            } catch (RadiusException e) {
                System.out.println(e.getMessage());
            }
            try {
                Circle circle3 = new Circle(-1.6);
            } catch (RadiusException e) {
                System.out.println(e.getMessage());
            }
            try {
                Circle circle4 = new Circle(-1.6);
            } catch (RadiusException e) {
                System.out.println(e.getMessage());
            }
            try {
                Circle circle5 = new Circle(-1.6);
            } catch (RadiusException e) {
                System.out.println(e.getMessage());
            }
            try {
                Circle circle6 = new Circle(-1.6);
            } catch (RadiusException e) {
                System.out.println(e.getMessage());
            }
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }
        String str = "Test Automation Bootcamp 6, 2022";
        String[] strArray = str.split(" ");
        String automation = strArray[1];
        System.out.println(automation.toLowerCase());
        for (String s : strArray
        ) {
            System.out.println(s);
        }
        System.out.println(str.length());
        System.out.println(str.replace(" ", "-"));
    }
}
