package com.designpatterns.template;

import java.util.Arrays;

public class ForEmployeeEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("employee.kowalski@onet.eu");
    }

    @Override
    public void setTopic() {
        topic = "For employee email";
    }
}
