package com.designpatterns.cinema;

public class TitanicTicketGenerator implements TicketGenerator {

    private static final double price = 28.5;

    @Override
    public void generateTicket() {
        System.out.println("Printing ticket for 'Titanic' movie... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }
}