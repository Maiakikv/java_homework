package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
 public static void main(String[] args) {
  Circle c1 = new Circle(20);
  Random r = new Random();
  Circle c2 = new Circle(r.nextDouble(0,100));
  Circle c3 = new Circle(24);
  Circle c4 = new Circle(26);
  Circle c5 = new Circle(25);

  Circle.numberOfCircleInstances();

  String a =Util.circleToString(c1);
  String b =Util.circleToString(c2);
  String c =Util.circleToString(c3);
  String d =Util.circleToString(c4);
  String e =Util.circleToString(c5);

  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);

 }
}
