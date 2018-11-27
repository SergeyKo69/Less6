package ex1;

import java.util.ArrayList;

public interface DBMapperInt {
    boolean save(Document document);
    boolean delete(Document document);
    boolean uplade(Document document);
    Document findById(String id);
    ArrayList<Document> getAll();
}
