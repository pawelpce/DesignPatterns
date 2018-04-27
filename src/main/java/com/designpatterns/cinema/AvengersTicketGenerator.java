package com.designpatterns.cinema;

public class AvengersTicketGenerator implements TicketGenerator {

    private static final double price = 25.5;

    @Override
    public void generateTicket() {

        System.out.println("Printing ticket for 'Avengers' movie... Price $" + price);

    }

    public static double getPrice() {
        return price;
    }
}