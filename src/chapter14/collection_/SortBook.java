package chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

public class SortBook {
    public static void main(String[] args) {
        List arr = new ArrayList();
        arr.add(new Book2("书1",6));
        arr.add(new Book2("书2",3));
        arr.add(new Book2("书3",9));
        arr.add(new Book2("书4",2));
        System.out.println(arr);
        sort(arr);
        System.out.println("-----------------");
        System.out.println(arr);
    }

    public static void sort(List arr){
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                Book2 book1 = (Book2) arr.get(j);
                Book2 book2 = (Book2) arr.get(j + 1);
                if(book1.getPrice() > book2.getPrice()){
                    arr.set(j,book2);
                    arr.set(j+1,book1);
                }
            }
        }
    }
}

class Book2{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
