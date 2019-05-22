package com.designpatterns.builder;

import static com.designpatterns.builder.ZusForm.*;

public class ZusApp {

    public static void main(String[] args) {

        ZusForm zusForm = ZusFormBuilder.builder().name("Paweł").surname("Banasiak").build();
        System.out.println("DEBUG");
    }
}
