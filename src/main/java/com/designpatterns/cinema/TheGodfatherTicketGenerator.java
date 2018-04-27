package com.designpatterns.cinema;

public class TheGodfatherTicketGenerator implements TicketGenerator {

    private static final double price = 23.5;

    @Override
    public void generateTicket() {
        System.out.println("Printing ticket for 'The Godfather' movie... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }
}