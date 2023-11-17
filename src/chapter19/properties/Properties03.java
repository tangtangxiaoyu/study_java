package chapter19.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","999+");

        properties.store(new FileOutputStream("src\\chapter19\\mysql2.properties"),"注释");

    }
}
