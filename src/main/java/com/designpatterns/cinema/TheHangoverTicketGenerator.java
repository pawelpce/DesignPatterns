package com.designpatterns.cinema;

public class TheHangoverTicketGenerator implements TicketGenerator {

    private static final double price = 20.0;

    @Override
    public void generateTicket() {
        System.out.println("Printing ticket for 'The Hangover' movie... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }
}