package chapter23.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\chapter23\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

        System.out.println("-----------");
        System.out.println(cls.getField("age").get(o));

        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);

    }
}
