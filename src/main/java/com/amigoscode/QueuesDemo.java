package com.amigoscode;

import lombok.extern.java.Log;

import java.util.LinkedList;
import java.util.Queue;

@Log
public class QueuesDemo {

    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();

        supermarket.offer(new Person("Paul", 42)); // same as add dependent on size etc
        supermarket.offer(new Person("Rory", 18));
        supermarket.add(new Person("Caitlin", 21));

        log.info(String.valueOf(supermarket.size()));
        log.info(String.valueOf(supermarket.peek()));

        Person x = supermarket.poll(); // removes from top of the queue

        log.info(String.valueOf(supermarket.size()));
        log.info(String.valueOf(x));
        log.info(String.valueOf(supermarket.peek()));

    }

    static record Person(String name, int age) {

    }
}
