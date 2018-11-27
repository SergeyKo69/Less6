package ex1;

import java.util.ArrayList;

public class DB {
    private static ArrayList<Document> list = new ArrayList<>();

    public static boolean save(Document document){
        list.add(document);
        return true;
    }

    public static boolean delete(Document document){
        return list.remove(document);
    }

    public static boolean update(Document document){
        int id = list.indexOf(document);
        if (id == -1){
            return false;
        }
        Document doc = list.get(id);
        doc.setId(document.getId());
        doc.setNumber(document.getNumber());
        doc.setDate(document.getDate());
        doc.setIsDelete(document.getIsDelete());
        doc.setTypeDoc(document.getTypeDoc());
        return true;
    }

    public static Document findById(String id){
        for (int i = 0; i < list.size(); i++) {
            Document doc = list.get(i);
            if(doc.getId() == id){
                return doc;
            }
        }
        return null;
    }

    public static ArrayList<Document> getAll(){
        return list;
    }
}
