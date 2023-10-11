package chapter13.Math_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",30);
        books[1] = new Book("西游",90);
        books[2] = new Book("海底两万里",5);
        books[3] = new Book("java从入门到入土",300);

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
//                return book1.getPrice() - book2.getPrice();
//                return book2.getPrice() - book1.getPrice();
                return book1.getName().length() - book2.getName().length();
            }
        });

        System.out.println(Arrays.toString(books));

    }
}


class Book{
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

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
