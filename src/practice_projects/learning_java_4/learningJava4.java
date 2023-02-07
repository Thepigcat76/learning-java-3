package practice_projects.learning_java_4;

import java.util.*;

public class learningJava4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sss");
        list.add("SSSSS");

        int i = 900;
        //Scanner scanner = new Scanner(System.in);
        //scanner.next();
        //System.out.println(list.get(0).equals("sss")); //returns boolean

        if (list.get(1).equals("sss")) {
            System.out.println("true");
        }

        List<Double> list1 = new ArrayList<>();
        list1.add(9000.999999 + i);

        System.out.println(list1.get(0));
        Map<String, String> ss = new HashMap<>();
        ss.put("SS", "SSSS");
        ss.put("BB", "BBBS");

        System.out.println(ss.get("BB").contains("S"));

        Set<String> usernames = new HashSet<>();
        usernames.add("eeee");
        usernames.add("bbbb");

        System.out.println("contains c: " + usernames.contains("c"));
        System.out.println("Exclusive username: " + usernames.add("bbb"));
    }
}
