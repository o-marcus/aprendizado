package com.java.mudancas_java_8_21.sealed_classes_pattern_match.model;

public sealed class Truck implements Vehicle permits MiniTruck {
    @Override
    public void acelerar() {
        System.out.println("Mini caminhão acelerando");
    }

    public void loadTruck() {
        System.out.println("Carregando caminhão");
    }
}





