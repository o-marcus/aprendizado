package com.java.mudancas_java_8_21.sealed_classes_pattern_match.model;

public final class Car implements Vehicle {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    public void estacionar() {
        System.out.println("Estacionando o carro");
    }

}
