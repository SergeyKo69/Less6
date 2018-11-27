package ex1;

import java.sql.Date;

public abstract class Document {
    private String id;
    private String number;
    private boolean isDelete;
    private Date date;
    private TypeDoc typeDoc;

    public TypeDoc getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(TypeDoc typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean delete) {
        isDelete = delete;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        Document doc = (Document)obj;
        if (doc.getId() == this.getId() && doc.number == this.getNumber() &&
            doc.getIsDelete() == this.getIsDelete() && doc.getDate() == this.getDate() &&
            doc.getTypeDoc() == this.getTypeDoc()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getTypeDoc().toString() + "№:" + getNumber() + " to: " + getDate();
    }
}
