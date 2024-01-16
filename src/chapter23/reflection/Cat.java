package chapter23.reflection;

public class Cat {
    private String name = "666";
    public int age = 10;
    public void hi(){
        System.out.println("hi" + name);
    }
    public Cat(){
    }
    public Cat(String name){
        this.name = name;
    }
}
