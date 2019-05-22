package com.designpatterns.pizzeria;

public class PizzaCreatorFactory {


    public PizzaCreator createPizza(int number){

        switch (number){

            case 1:
                return new PizzaMargheritaCreator();
            case 2:
                return new PizzaCappricciosaCreator();
            case 3:
                return new PizzaHawajskaCreator();
            case 4:
                return new PizzaDiaboloCreator();
            case 5:
                return new PizzaWegetarianskaCreator();
            default:
                throw new IllegalArgumentException("BAD ARGUMENT");
        }
    }
}