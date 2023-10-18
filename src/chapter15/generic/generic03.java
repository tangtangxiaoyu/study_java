package chapter15.generic;

public class generic03 {
    public static void main(String[] args) {
        Teacher<String> teacher = new Teacher<String>("jack");
        System.out.println(teacher);

    }
}

class Teacher<E>{
    E name;

    public Teacher(E name) {
        this.name = name;
    }
    public E f(){
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + name +
                '}';
    }
}
