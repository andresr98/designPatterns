package com.design.patterns.creationals.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentPrototypeManager {

    private static Map<String, PrototypeCapableDocument> prototypes =
            new HashMap<String, PrototypeCapableDocument>();

    static {
        TAndC tAndC = new TAndC();
        tAndC.setVendorName("Vendor Name Placeholder");

        // Ejemplo de traer datos de bd y no tener que hacer multiples lecturas
        tAndC.setContent("Please read and accept the terms and conditions...");
        prototypes.put("tandc", tAndC);

        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Andrew Clark");
        authorizedSignatory.setDesignation("Operation Head");

        NDAgreement nda = new NDAgreement();
        nda.setVendorName("Vendor Name Placeholder");

        // Nuevamente traer datos de bd y no tener que hacer multiples lecturas
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("nda", nda);
    }

    public static PrototypeCapableDocument getClonedDocument (final String type) {
        PrototypeCapableDocument clonedDoc = null;

        try {
            PrototypeCapableDocument doc = prototypes.get(type);
            clonedDoc = doc.cloneDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedDoc;
    }
}
