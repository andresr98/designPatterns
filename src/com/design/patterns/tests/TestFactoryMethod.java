package com.design.patterns.tests;

import com.design.patterns.creationals.factoryMethod.BasePizzaFactory;
import com.design.patterns.creationals.factoryMethod.Pizza;
import com.design.patterns.creationals.factoryMethod.PizzaFactory;

public class TestFactoryMethod implements ITestPattern {

    @Override
    public void test() {
        System.out.println("Usando el patron Factory Method. \n");
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}
