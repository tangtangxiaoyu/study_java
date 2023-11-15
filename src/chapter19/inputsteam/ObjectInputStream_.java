package chapter19.inputsteam;

import chapter19.outputsteam.Dog;

import java.io.*;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String str = "f:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(str));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object o = ois.readObject();
        System.out.println(o.getClass());
        System.out.println(o);
        Dog o2 = (Dog)o;
        System.out.println(o2.getName());
        ois.close();
    }
}


