package com.amigoscode;

import lombok.extern.java.Log;

import java.util.Arrays;

@Log
public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Green";
        colors[2] = "Pink";
        colors[3] = "Yellow";
        colors[4] = "White";


        log.info(Arrays.toString(colors));
        log.info(colors[0]);

        int[] numbers = {100, 200};
        log.info(Arrays.toString(numbers));

        for (String color : colors) {
            log.info(color);
        }

        Arrays.stream(colors).forEach(log::info);

        Arrays.sort(colors);
        Arrays.stream(colors).forEach(log::info);
    }
}
