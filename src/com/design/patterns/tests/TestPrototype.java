package com.design.patterns.tests;

import com.design.patterns.creationals.prototype.DocumentPrototypeManager;
import com.design.patterns.creationals.prototype.PrototypeCapableDocument;

public class TestPrototype implements ITestPattern {

    @Override
    public void test() {
        System.out.println("Usando el patrón Prototype\n");
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);

        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }
}
