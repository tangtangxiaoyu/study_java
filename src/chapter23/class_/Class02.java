package chapter23.class_;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classPath = "chapter23.class_.Car";
        Class<?> cls = Class.forName(classPath);
        System.out.println(cls);
        System.out.println(cls.getClass());
        System.out.println(cls.getPackage().getName());
        System.out.println(cls.getName());

        Car car = (Car)cls.newInstance();
        System.out.println(car);

        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        brand.set(car,"suv");
        System.out.println(brand.get(car));

        Field[] fields = cls.getFields();
        for(Field f: fields){
            System.out.println(f.getName());
        }
    }
}
