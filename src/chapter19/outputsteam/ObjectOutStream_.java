package chapter19.outputsteam;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        String str = "f:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(str));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("23SDF");
        oos.writeObject(new Dog("aaa",5));
        oos.close();

        System.out.println("保存完毕..");

    }
}

