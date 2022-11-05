package ge.tbc.testautomation.javaoop.figures;

public class Circle {
    private double radius;
    private static int count;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void numberOfCircleInstances(){
        System.out.println(count);
    }
    public void getCount(){
        System.out.println(count);
    }
}
