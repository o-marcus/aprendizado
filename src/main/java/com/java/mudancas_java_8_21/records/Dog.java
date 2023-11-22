package com.java.mudancas_java_8_21.records;

import java.util.Objects;

public  record Dog(String nome, String raca) {

    //  Expectativa de vida em anos
    public static int  lifeExpectancy = 12;

    public Dog {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(raca);
    }

    public Dog(String nome) {
        this(nome, "Unknown");
    }

    public static void bark() {
        System.out.println("Dog Barking");
    }

}




