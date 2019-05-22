package com.designpatterns.decorator2;

public class TempomatDecorator implements Car{

    private Car car;

    public TempomatDecorator(Car car) {
        this.car = car;
    }

    public void build() {
        car.build();
        System.out.println("Adding tempomat...");
    }
}