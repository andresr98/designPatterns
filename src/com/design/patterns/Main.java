package com.design.patterns;


import com.design.patterns.tests.*;

public class Main {

    public static void main(String[] args) {

        //Arrange
        ITestPattern testPattern;

        //Probar adapter
        //testPattern = new TestAdapter();

        //Probar bridge
        //testPattern = new TestBridge();

        // Probar singleton
        //testPattern = new TestSingleton();

        //Probar factory method
        //testPattern = new TestFactoryMethod();

        //Probar Prototype
        testPattern = new TestPrototype();

        //Act
        testPattern.test();

    }
}
