package com.designpatterns.singleton;

import com.designpatterns.singleton.Singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

    }

}
