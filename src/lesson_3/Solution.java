package lesson_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        String[] ss = {"hello", "jack", "apple", "apple", "hello", "night", "morning", "knight", "morning", "Bob"};
        method1(ss);

        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Borjoo", "+951384");
        phoneBook.add("Moon", "+95153184");
        phoneBook.add("Borjoo", "+9515513384");
        phoneBook.add("Jackel", "+951323518484");
        phoneBook.add("Moon", "+95134451584");

        System.out.println("Borjoo: " + phoneBook.get("Borjoo"));
        System.out.println("Moon:" + phoneBook.get("Moon"));
        System.out.println("Jackel:" + phoneBook.get("Jackel"));
    }

    public static void method1(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
        }

        for(Map.Entry<String, Integer> tp : map.entrySet()) {
            System.out.println(tp.getKey() + " - " + tp.getValue());
        }
    }
}
