package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBMapper implements DBMapperInt {
    private Map<String, Document> docMap = new HashMap<>();

    @Override
    public boolean save(Document document) {
        if (checkDoc(document)){
            return true;
        }
        boolean res = DB.save(document);
        if (res){
            docMap.put(document.getId(),document);
        }
        return res;
    }

    @Override
    public boolean delete(Document document) {
        return DB.delete(document);
    }

    private boolean checkDoc(Document document){
        Document doc = docMap.get(document.getId());
        if (doc != null && doc.equals(document)){
            return true;
        }
        return false;
    }

    @Override
    public boolean uplade(Document document) {
        if (checkDoc(document)){
            return true;
        }
        boolean res = DB.update(document);
        if (res){
            docMap.put(document.getId(),document);
        }
        return res;
    }

    @Override
    public Document findById(String id) {
        Document doc = docMap.get(id);
        if (doc != null){
            return doc;
        }
        doc = DB.findById(id);
        if (doc != null){
            docMap.put(id,doc);
        }
        return doc;
    }

    @Override
    public ArrayList<Document> getAll() {
        return DB.getAll();
    }
}
