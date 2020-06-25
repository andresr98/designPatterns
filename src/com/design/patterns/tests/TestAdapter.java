package com.design.patterns.tests;

import com.design.patterns.structurals.adapter.*;

public class TestAdapter implements ITestPattern {

    @Override
    public void test() {

        //Se valida que funcione el NewLineFomatter
        System.out.println("Usando el patrón Adapter\n");

        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println("Formateador de New Line");
        System.out.println(resultString);

        //Se valida que convierta el texto a un CSV
        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println("Formateador de CSV con adapter");
        System.out.println(resultCsvString);
    }
}
