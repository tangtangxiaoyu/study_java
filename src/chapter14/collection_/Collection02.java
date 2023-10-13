package chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection co = new ArrayList();
        co.add(new Book("111","111"));
        co.add(new Book("222","222"));
        co.add(new Book("333","333"));
//        Iterator iterator = co.iterator();
//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            System.out.println(o);
//        }
        for(Object book: co){
            System.out.println(book);
        }
    }
}

class Book{
    private String name;
    private String price;

    public Book(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
