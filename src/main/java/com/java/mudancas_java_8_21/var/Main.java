package com.java.mudancas_java_8_21.var;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        sumUsingVar(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static void sumUsingVar(List<Integer> integers) {

        var result = integers.stream().reduce(0, (v1, v2) -> v1 + v2);

        System.out.println("The sum for");

        for (var number : integers) {
            System.out.println(number + " ");
        }

        System.out.println("Is " + result);
    }

}
