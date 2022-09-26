package com.amigoscode;

import lombok.extern.java.Log;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

@Log
public class ListAndArrayLists {

    public static void main(String[] args) {

        List<Color> colors = new ArrayList<>();
        colors.add(Color.BLUE);
        colors.add(Color.RED);

        log.info(String.valueOf(colors.contains(Color.GRAY)));

        for (Color color: colors) {
            log.info(color.toString());
        }


    }
}
