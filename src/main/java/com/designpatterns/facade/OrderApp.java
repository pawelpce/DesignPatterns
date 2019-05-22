package com.designpatterns.facade;

public class OrderApp {

    public static void main(String[] args) {

        Order order = new Order("1234");
        OrderFacade facade = new OrderFacade();
        facade.processOrder(order);

    }

}
