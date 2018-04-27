package com.designpatterns.cinema;

public class TheLordOfTheRingsTicketGenerator implements TicketGenerator {

    private static final double price = 30.0;

    @Override
    public void generateTicket() {
        System.out.println("Printing ticket for 'The Lord Of The Rings' movie... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }
}