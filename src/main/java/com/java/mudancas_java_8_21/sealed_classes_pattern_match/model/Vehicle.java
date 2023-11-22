package com.java.mudancas_java_8_21.sealed_classes_pattern_match.model;

/*
* Sealed Classes
* */

public sealed interface Vehicle permits Car, Truck {
    void acelerar();
}




