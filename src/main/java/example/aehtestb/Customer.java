package example.aehtestb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FBNK_CUSTOMER")

public class Customer {
    @Id
    private String recid;  // Clé primaire

    private String xmlrecord; // Champ XML représenté comme une chaîne de caractères

    // Getters and setters

    public String getRecid() {
        return recid;
    }

    public void setRecid(String recid) {
        this.recid = recid;
    }

    public String getXmlrecord() {
        return xmlrecord;
    }

    public void setXmlrecord(String xmlrecord) {
        this.xmlrecord = xmlrecord;
    }
}
