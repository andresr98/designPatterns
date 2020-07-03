package com.design.patterns.creationals.prototype;

//Clase base para clonar, note la implementacion de la interfaz
public abstract class PrototypeCapableDocument implements Cloneable {

    private String vendorName;
    private String content;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Metodo que indica la clase a clonar
    public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
}
