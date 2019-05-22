package com.designpatterns.decorator2;

public class DeckComputerDecorator implements Car {

    private Car car;

    public DeckComputerDecorator(Car car) {
        this.car = car;
    }

    public void build() {
        car.build();
        System.out.println("Adding deck computer...");
    }
}