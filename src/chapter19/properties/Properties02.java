package chapter19.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\chapter19\\mysql.properties"));
        properties.list(System.out);
        System.out.println(properties.getProperty("user"));
    }
}
