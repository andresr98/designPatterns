package com.design.patterns.tests;

import com.design.patterns.creationals.singleton.SingletonClass;

public class TestSingleton implements ITestPattern {

    @Override
    public void test() {
        System.out.println("Probando el patrón singleton");

        System.out.println("Primer llamado");
        SingletonClass firstInstance = SingletonClass.getInstance();
        System.out.println("El valor de value es: " + firstInstance.getValue());

        System.out.println("Modificando el valor a 8...");
        firstInstance.setValue(8);

        SingletonClass secondInstance = SingletonClass.getInstance();

        System.out.println("Note que value sigue siendo 8, así se llame con en otra instancia");
        System.out.println("El valor de value en el segundo llamado es : " + secondInstance.getValue());
    }
}
