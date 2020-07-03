package com.design.patterns.creationals.prototype;

// Clase concreta que se clona
public class TAndC extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() {

        // Copia superficial
        TAndC tAndC = null;

        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
