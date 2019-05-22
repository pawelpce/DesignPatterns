package com.designpatterns.decorator2;

import java.util.Scanner;

public class CarFactoryMain {

    public static void main(String[] args) {

        printMainMenu();

        Scanner in = new Scanner(System.in);
        int carNumber = in.nextInt();
        Car car = null;

        switch (carNumber){
            case 1:
                car = new Peugeot();
                break;
            case 2:
                car = new Renault();
                break;
            case 3:
                car = new Fiat();
                break;
        }

        printExtras();
        int extrasNumber = in.nextInt();
        while (extrasNumber != 4){
            switch (extrasNumber){
                case 1:
                    car = new TempomatDecorator(car);
                    break;
                case 2:
                    car = new NavigationDecorator(car);
                    break;
                case 3:
                    car = new DeckComputerDecorator(car);
                    break;
            }
            printExtras();
            extrasNumber = in.nextInt();
        }
        car.build();

    }

    private static void printMainMenu() {

        System.out.println("Hello, please choose car: ");
        System.out.println("1. Peugeot");
        System.out.println("2. Renault");
        System.out.println("3. Fiat");

    }

    private static void printExtras() {

        System.out.println("Add extras: ");
        System.out.println("1. Tempomat");
        System.out.println("2. Navigation");
        System.out.println("3. Deck computer");
        System.out.println("4. End");

    }

}