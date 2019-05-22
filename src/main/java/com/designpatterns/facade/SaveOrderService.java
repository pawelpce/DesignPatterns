package com.designpatterns.facade;

public class SaveOrderService {

    public void saveOrder(Order order){

        System.out.println("Save order number: " + order.getOrderNumber());

    }

}
