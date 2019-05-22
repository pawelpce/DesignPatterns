package com.designpatterns.pizzeria;

import java.util.Scanner;

public class PizzaCreatorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, what pizza would you like to order?");
        System.out.println("1. Margherita");
        System.out.println("2. Cappricciosa");
        System.out.println("3. Hawajska");
        System.out.println("4. Diabolo");
        System.out.println("5. Wegetariańska");
        int number = scanner.nextInt();

        PizzaCreatorFactory factory = new PizzaCreatorFactory();
        PizzaCreator pizzaCreator;

        pizzaCreator = factory.createPizza(number);
        pizzaCreator.showIngredients();

    }

}
