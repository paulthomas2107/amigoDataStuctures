package com.amigoscode;

import lombok.extern.java.Log;

import java.util.Stack;

@Log
public class StackExamples {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        stack.push(Integer.MIN_VALUE);

        log.info(stack.peek().toString());
        log.info(String.valueOf(stack.size()));
        Integer x = stack.pop();
        log.info("x: "+x);
        log.info(String.valueOf(stack.size()));
        x = stack.pop();
        log.info("x: "+x);
        log.info(String.valueOf(stack.size()));

        stack.push(Integer.MAX_VALUE);
        stack.push(Integer.MIN_VALUE);

        if (!stack.empty()) {
            stack.forEach(entry -> {
                log.info(entry.toString());
            });
        }





    }
}
