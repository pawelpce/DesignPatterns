package com.designpatterns.cinema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CinemaApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printCinemaMenu();

        TicketGeneratorFactory factory = TicketGeneratorFactory.getInstance();
        TicketGenerator ticketGenerator;

        int number = getMovieNumber(scanner);

        ticketGenerator = factory.createTicketGenerator(number);
        double price = factory.getPrice(number);

        printCinemaSnacksMenu();

        double snacksPrice = 0;
        int snackNumber = getSnackNumber(scanner);
        while (snackNumber != 4){
            switch (snackNumber){
                case 1:
                    ticketGenerator = new PopcornDecorator(ticketGenerator);
                    snacksPrice = snacksPrice + PopcornDecorator.getPrice();
                    break;
                case 2:
                    ticketGenerator = new PepsiDecorator(ticketGenerator);
                    snacksPrice = snacksPrice + PepsiDecorator.getPrice();
                    break;
                case 3:
                    ticketGenerator = new NachosDecorator(ticketGenerator);
                    snacksPrice = snacksPrice + NachosDecorator.getPrice();
                    break;
            }
            printCinemaSnacksMenu();
            snackNumber = getSnackNumber(scanner);
        }

        ticketGenerator.generateTicket();

        double discount = getDiscount(snacksPrice);

        double totalPrice = price + snacksPrice - discount;
        System.out.println("TOTAL PRICE: $" + totalPrice);

    }

    private static double getDiscount(double snacksPrice) {
        double discount = 0;
        if (PepsiDecorator.getNumberOfInstances() > 0 && PopcornDecorator.getNumberOfInstances() > 0 && NachosDecorator.getNumberOfInstances() > 0){
            discount = 0.1 * snacksPrice;
            System.out.println("You chose all snacks. Your discount is: $" + discount);
        }
        return discount;
    }

    private static int getMovieNumber(Scanner scanner) {
        int number = 0;
        boolean correctInput;
        do {
            try {
                correctInput = true;
                number = scanner.nextInt();
                while (!(number > 0 && number < 6)) {
                    System.out.println("Not recognizing the number. Try again.");
                    number = scanner.nextInt();
                }
            } catch (InputMismatchException e) {
                scanner.next();
                correctInput = false;
                System.out.println("Bad Argument. Try Again.");
            }

        } while (!correctInput);

        return number;
    }

    private static int getSnackNumber(Scanner scanner) {
        int number = 0;
        boolean correctInput;
        do {
            try {
                correctInput = true;
                number = scanner.nextInt();
                if (!(number > 0 && number < 5)) {
                    System.out.println("Not recognizing the number. Try again.");
                    continue;
                }
            } catch (InputMismatchException e) {
                scanner.next();
                correctInput = false;
                System.out.println("Bad Argument. Try Again.");
            }

        } while (!correctInput);

        return number;
    }

    private static void printCinemaMenu() {
        System.out.println("Hello, what movie would you like to choose?");
        System.out.println("1. Avengers");
        System.out.println("2. The Hangover");
        System.out.println("3. The Lord Of The Rings");
        System.out.println("4. Titanic");
        System.out.println("5. The Godfather");
    }

    private static void printCinemaSnacksMenu() {
        System.out.println("What would you like to order?\nIf you choose all snacks, the discount will be 10%.");
        System.out.println("1. Popcorn");
        System.out.println("2. Pepsi");
        System.out.println("3. Nachos");
        System.out.println("4. End");
    }

}
