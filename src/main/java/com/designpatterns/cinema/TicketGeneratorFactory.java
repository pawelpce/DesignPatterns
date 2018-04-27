package com.designpatterns.cinema;

public class TicketGeneratorFactory {

    private static TicketGeneratorFactory factory = null;

    private TicketGeneratorFactory(){

    }

    public static TicketGeneratorFactory getInstance() {

        if (factory == null) {
            factory = new TicketGeneratorFactory();
        }
        return factory;
    }

        public TicketGenerator createTicketGenerator(int number){

            switch (number){
                case 1:
                    return new AvengersTicketGenerator();
                case 2:
                    return new TheHangoverTicketGenerator();
                case 3:
                    return new TheLordOfTheRingsTicketGenerator();
                case 4:
                    return new TitanicTicketGenerator();
                case 5:
                    return new TheGodfatherTicketGenerator();
                default:
                    throw new IllegalArgumentException("BAD ARGUMENT");
            }

        }

        public double getPrice(int number) {

            switch (number){
                case 1:
                    return AvengersTicketGenerator.getPrice();
                case 2:
                    return TheHangoverTicketGenerator.getPrice();
                case 3:
                    return TheLordOfTheRingsTicketGenerator.getPrice();
                case 4:
                    return TitanicTicketGenerator.getPrice();
                case 5:
                    return TheGodfatherTicketGenerator.getPrice();
                default:
                    throw new IllegalArgumentException("BAD ARGUMENT");
            }

        }

}