package com.design.patterns.creationals.singleton;

public class SingletonClass {
    private static SingletonClass instance = null;
    private int value = 0;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
