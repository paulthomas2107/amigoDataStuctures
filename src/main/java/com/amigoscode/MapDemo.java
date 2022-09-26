package com.amigoscode;

import lombok.extern.java.Log;

import java.util.HashMap;
import java.util.Map;

@Log
public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, Person> people = new HashMap<>();
        people.put(1, new Person(1, "Paul"));
        people.put(2, new Person(2, "Caitlin"));
        people.put(3, new Person(3, "Rory"));

        people.forEach((id, person) -> {
            log.info(id + " " + person);
        });

        log.info(String.valueOf(people.containsKey(1)));
        log.info(String.valueOf(people.containsValue(new Person(2, "Caitlin"))));
        people.clear(); // empty
    }

    static record Person(Integer id, String name) {

    }
}
