package com.designpatterns.decorator2;

public class NavigationDecorator implements Car {

    private Car car;

    public NavigationDecorator(Car car) {
        this.car = car;
    }

    public void build() {
        car.build();
        System.out.println("Adding navigation...");
    }
}