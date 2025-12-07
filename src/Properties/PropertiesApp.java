package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.port"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));

            properties.put("hobby", "Coding");
            properties.store(new FileOutputStream("application.properties"), "Komentar");
        } catch (FileNotFoundException error) {
            System.out.println("File tidak ketemu");
        } catch(IOException error) {
            System.out.println("Gagal load data dari file");
        }
    }
}
