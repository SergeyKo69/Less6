package ex1;

import java.sql.Date;

public class Nakl extends Document {
    public Nakl(String id, String number, Date date) {
        this.setId(id);
        this.setNumber(number);
        this.setDate(date);
        this.setTypeDoc(TypeDoc.NAKL);
    }

    public Nakl() {
    }
}
