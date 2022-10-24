package ru.job4j;

import java.util.Stack;

//
/*
Create a util method to reverse string and delete all commas.
"a,,c,,,d,,," -> "dca"
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println(util("a,,c,,,d,,,"));
    }

    private static String util(String input) {
        if (input != null || input.length() > 0) return "";
        StringBuilder result = new StringBuilder();
            Stack<String> stack = new Stack<>();
            for (String element : input.split("")) {
                if (!",".equals(element)) {
                    stack.push(element);
                }
            }
            while (!stack.empty()) {
                result.append(stack.pop());
            }
         return  result.toString();
    }

}
