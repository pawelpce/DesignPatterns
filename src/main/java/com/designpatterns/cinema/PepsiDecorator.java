package com.designpatterns.cinema;

public class PepsiDecorator implements TicketGenerator {

    private TicketGenerator ticketGenerator;
    private static final double price = 6.5;
    private static int numberOfInstances = 0;

    public PepsiDecorator (TicketGenerator ticketGenerator){
        this.ticketGenerator = ticketGenerator;
        numberOfInstances++;
    }

    @Override
    public void generateTicket() {
        ticketGenerator.generateTicket();
        System.out.println("Preparing pepsi... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }
}
