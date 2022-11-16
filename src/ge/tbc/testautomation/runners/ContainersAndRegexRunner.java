package ge.tbc.testautomation.runners;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainersAndRegexRunner {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("555-542-231");
        arr.add("555-887-987");
        arr.add("555-161-143");
        arr.add("555-189-66");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        Map<String, String> phone = new HashMap<>();
        phone.put("giorgi", arr.get(0));
        phone.put("eka", arr.get(1));
        phone.put("nugzari", arr.get(2));
        phone.put("dato", arr.get(3));

        for (String key : phone.keySet()
        ) {
            String value = phone.get(key);
            if (value.contains("8")) {
                System.out.println(key);
            }
        }
        Set<Circle> tree = new TreeSet<Circle>();
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(15);
        Circle c3 = new Circle(6);
        Circle c4 = new Circle(5);
        Circle c5 = new Circle(2);
        Circle c6 = new Circle(11);
        Circle c7 = new Circle(2);
        Circle c8 = new Circle(7);
        Circle c9 = new Circle(11);
        Circle c10 = new Circle(3);

        tree.add(c1);
        tree.add(c2);
        tree.add(c3);
        tree.add(c4);
        tree.add(c5);
        tree.add(c6);
        tree.add(c7);
        tree.add(c8);
        tree.add(c9);
        tree.add(c10);
        System.out.println(tree);

        Set<Circle> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c6);
        set.add(c7);
        set.add(c8);
        set.add(c9);
        set.add(c10);
        System.out.println(set);

        for (String a: arr
             ) {
            System.out.println(phoneNumberValidation(a));

        }
    }
    private static boolean phoneNumberValidation(String phoneNumber){
        boolean found = false;
        String phonePattern = "(555\\d{6})";

        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(phoneNumber.replaceAll("-", ""));


        if (matcher.find()) {
            found = true;

        }
        return found ;
    }
}
