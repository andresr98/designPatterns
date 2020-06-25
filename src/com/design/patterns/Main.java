package com.design.patterns;


import com.design.patterns.tests.ITestPattern;
import com.design.patterns.tests.TestAdapter;
import com.design.patterns.tests.TestBridge;
import com.design.patterns.tests.TestSingleton;

public class Main {

    public static void main(String[] args) {

        //Arrange
        ITestPattern testPattern;

        //Probar adapter
        //testPattern = new TestAdapter();

        //Probar bridge
        //testPattern = new TestBridge();

        // Probar singleton
        testPattern = new TestSingleton();

        //Act
        testPattern.test();

    }
}
