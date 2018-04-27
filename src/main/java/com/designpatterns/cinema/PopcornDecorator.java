package com.designpatterns.cinema;

public class PopcornDecorator implements TicketGenerator {

    private TicketGenerator ticketGenerator;
    private static final double price = 7.0;
    private static int numberOfInstances = 0;

    public PopcornDecorator (TicketGenerator ticketGenerator){
        this.ticketGenerator = ticketGenerator;
        numberOfInstances++;
    }

    @Override
    public void generateTicket() {
        ticketGenerator.generateTicket();
        System.out.println("Preparing popcorn... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }
}