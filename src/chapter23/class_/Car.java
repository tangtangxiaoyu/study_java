package chapter23.class_;

public class Car {
    public String brand = "宝马";
    public int price = 10;
    public String color = "red";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
