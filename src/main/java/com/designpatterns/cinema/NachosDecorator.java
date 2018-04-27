package com.designpatterns.cinema;

public class NachosDecorator implements TicketGenerator {

    private TicketGenerator ticketGenerator;
    private static final double price = 8.5;
    private static int numberOfInstances = 0;

    public NachosDecorator (TicketGenerator ticketGenerator){
        this.ticketGenerator = ticketGenerator;
        numberOfInstances++;
    }

    @Override
    public void generateTicket() {
        ticketGenerator.generateTicket();
        System.out.println("Preparing nachos... Price $" + price);
    }

    public static double getPrice() {
        return price;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }
}