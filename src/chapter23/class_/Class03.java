package chapter23.class_;

public class Class03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1
        String classPath = "chapter23.class_.Car";
        Class<?> cls1 = Class.forName(classPath);
        System.out.println(cls1);

        //2
        Class<?> cls2 = Car.class;
        System.out.println(cls2);

        //3
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);

        //4
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(classPath);

        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);

        System.out.println(Integer.TYPE);


    }
}
