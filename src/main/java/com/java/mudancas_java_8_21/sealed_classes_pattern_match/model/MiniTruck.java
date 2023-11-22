package com.java.mudancas_java_8_21.sealed_classes_pattern_match.model;

public non-sealed class MiniTruck extends Truck {

    public void unload(int itens) {
        System.out.println("Descarregnado " + itens + " do caminhão");
    }

}



