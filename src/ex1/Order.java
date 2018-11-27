package ex1;

import java.sql.Date;

public class Order extends Document {
    public Order() {
    }

    public Order(String id, String number, Date date) {
        this.setId(id);
        this.setNumber(number);
        this.setDate(date);
        this.setTypeDoc(TypeDoc.ORDER);
    }
}
