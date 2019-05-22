package com.designpatterns.template;

import java.util.Arrays;

public class ForManagersEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("managers@interia.pl, adamceo@onet.pl");
    }

    @Override
    public void setTopic() {
        topic = "Email for managers";
    }
}