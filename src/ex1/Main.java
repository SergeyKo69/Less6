package ex1;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Nakl nakl1 = new Nakl("1","00001",new Date(new java.util.Date().getTime()));
        Nakl nakl2 = new Nakl("2","00002",new Date(new java.util.Date().getTime()));
        Nakl nakl3 = new Nakl("3","00003",new Date(new java.util.Date().getTime()));
        Nakl nakl4 = new Nakl("4","00004",new Date(new java.util.Date().getTime()));
        Nakl nakl5 = new Nakl("5","00005",new Date(new java.util.Date().getTime()));
        Nakl nakl6 = new Nakl("6","00006",new Date(new java.util.Date().getTime()));
        Nakl nakl7 = new Nakl("7","00007",new Date(new java.util.Date().getTime()));

        Order order1 = new Order("8","00001",new Date(new java.util.Date().getTime()));
        Order order2 = new Order("9","00002",new Date(new java.util.Date().getTime()));
        Order order3 = new Order("10","00003",new Date(new java.util.Date().getTime()));
        Order order4 = new Order("11","00004",new Date(new java.util.Date().getTime()));
        Order order5 = new Order("12","00005",new Date(new java.util.Date().getTime()));
        Order order6 = new Order("13","00006",new Date(new java.util.Date().getTime()));
        Order order7 = new Order("14","00007",new Date(new java.util.Date().getTime()));

        DBMapper dbMapper = new DBMapper();
        dbMapper.save(nakl1);
        dbMapper.save(nakl2);
        dbMapper.save(nakl3);
        dbMapper.save(nakl4);
        dbMapper.save(nakl5);
        dbMapper.save(nakl6);
        dbMapper.save(nakl7);
        dbMapper.save(order1);
        dbMapper.save(order2);
        dbMapper.save(order3);
        dbMapper.save(order4);
        dbMapper.save(order5);
        dbMapper.save(order6);
        dbMapper.save(order7);
        dbMapper.save(nakl1);
        dbMapper.save(nakl2);
        ArrayList<Document> list = dbMapper.getAll();
        for (int i = 0; i < list.size(); i++) {
            Document doc = list.get(i);
            System.out.println(doc.toString());
        }

        Document document = dbMapper.findById("1");
        System.out.println(document.toString());

    }
}
