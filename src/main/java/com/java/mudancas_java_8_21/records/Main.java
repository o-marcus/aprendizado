package com.java.mudancas_java_8_21.records;

import com.java.mudancas_java_8_21.sealed_classes_pattern_match.model.Car;
import com.java.mudancas_java_8_21.sealed_classes_pattern_match.model.Vehicle;

import java.util.List;

public class Main {

    /*
    * Records
    * */

    public static void main(String[] args, Vehicle vehicle) {

        //  Usando o contrutor gerado
        Dog bilu = new Dog("Bilu", "Yorkshire");

        // Usando getters
        System.out.println(bilu.nome());
        System.out.println(bilu.raca());

        //Criando outro cachorro
        Dog thor = new Dog("Thor", "Yorkshire");

        // Usando equals
        if (thor.equals(bilu)) {
            System.out.println("Same Dog");
        }

        //  To String gerado pela record
        System.out.println(bilu);

    }

    public static void estacionarTodos(List<Car> cars) {

       Runnable runnable = () -> System.out.println("Hello World");

    }


}



