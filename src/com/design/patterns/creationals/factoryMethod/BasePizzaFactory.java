package com.design.patterns.creationals.factoryMethod;

public abstract class BasePizzaFactory {

    // Desacoplar el cliente para que una clase concreta de la logica
    public abstract Pizza createPizza(String type);
}
