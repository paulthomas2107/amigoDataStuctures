package com.amigoscode;

import lombok.extern.java.Log;

import java.util.HashSet;
import java.util.Set;

@Log
public class SetsDemo {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Paul");
        names.add("Caitlin");
        names.add("Rory");
        names.add("Paul"); // not added

        log.info(names.toString());
        names.forEach(name -> {
            log.info(name);
        });




    }
}
