package com.designpatterns.builder;

import java.util.Arrays;

import static com.designpatterns.builder.Car.CarBuilder;

public class CarApp {

    public static void main(String[] args) {

        Car car = CarBuilder.builder()
                .company("Ford")
                .model("Escort")
                .year(2005)
                .countryOfOrigin("USA")
                .engineType(EngineType.DIESEL)
                .additionalFeatures(Arrays.asList("Radio"))
                .mileage(150000)
                .engine(2.5)
                .build();

        Car car1 = CarBuilder.builder()
                .company("Peugeot")
                .model("308")
                .year(2010)
                .additionalFeatures(Arrays.asList("Tempomat", "Radio"))
                .engine(2.1)
                .mileage(78000)
                .countryOfOrigin("France")
                .build();

        System.out.println(car);
        System.out.println(car1);

    }

}
