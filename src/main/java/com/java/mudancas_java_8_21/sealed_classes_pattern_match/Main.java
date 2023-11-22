package com.java.mudancas_java_8_21.sealed_classes_pattern_match;

import com.java.mudancas_java_8_21.sealed_classes_pattern_match.model.Car;
import com.java.mudancas_java_8_21.sealed_classes_pattern_match.model.Truck;
import com.java.mudancas_java_8_21.sealed_classes_pattern_match.model.Vehicle;

public class Main {

    /**
     * Pattern Match */

    public static void acelerar(Vehicle vehicle) {
        if (vehicle instanceof Truck truck) {
            //  Definimos uma variável truck no escopo do if, caso true
            truck.loadTruck();
        }
        else if(vehicle instanceof Car car) {
            //  Definimos uma variável car no escopo do if, caso true
            car.estacionar();
        }
    }

}








