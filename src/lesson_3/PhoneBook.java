package lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> map = new HashMap<>();

    public void add(String surname, String number) {
        if (map.containsKey(surname)) {
            map.get(surname).add(number);
        }

        if (!map.containsKey(surname)) {
            map.put(surname, new ArrayList<>());
            map.get(surname).add(number);
        }
    }

    public List<String> get(String surname) {
        return map.get(surname);
    }
}
