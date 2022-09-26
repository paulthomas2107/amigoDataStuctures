package com.amigoscode;

import lombok.extern.java.Log;

import java.util.LinkedList;
import java.util.ListIterator;

@Log
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> dogList = new LinkedList<>();
        dogList.add("Alsatian");
        dogList.add("Labrador");
        dogList.add("Chihuahua");
        dogList.add("Chihuahua");

        log.info(dogList.toString());

        dogList.add(1, "Poodle");

        log.info(dogList.toString());

        LinkedList<String> dogListRemovals = new LinkedList<>();
        dogListRemovals.add("Chihuahua");

        dogList.removeAll(dogListRemovals);
        log.info(dogList.toString());

        dogList.addAll(1, dogListRemovals);
        log.info(dogList.toString());

        ListIterator<String> dogListIterator = dogList.listIterator();
        while (dogListIterator.hasNext()) { //  Normal order
            log.info(dogListIterator.next());
        }
        while (dogListIterator.hasPrevious()) { // reverse
            log.info(dogListIterator.previous());
        }




    }
}
