package com.designpatterns.template;

import java.util.Collections;
import java.util.List;

public abstract class EmailGenerator {

    List<String> to;
    List<String> cc;
    String topic;

    public abstract void setToList();

    public abstract void setTopic();

    public void setCcList(){
        cc = Collections.emptyList();
    }

    public final void sendEmail() {
        setToList();
        setCcList();
        setTopic();
        printEmail();

    }

    private void printEmail() {
        System.out.println("Email topic: " + topic);
        System.out.print("Email to: ");

        to.forEach(System.out::print);
        System.out.println("");
        System.out.println("Email content: THIS IS EMAIL CONTENT");

        cc.forEach(System.out::print);
    }

}
