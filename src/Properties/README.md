# Properties Class
- Kebanyakan aplikasi Java akan menyimpan konfigurasi file dalam bentuk properties file.
- Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=).
- Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita.
- Properties Class adalah class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties
- [Dokumentasi Properties Class](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html)
- Kode: Properties Class

```java
try {
    Properties properties = new Properties();
    properties.load(new FileInputStream("application.properties"));
    
    System.out.println(properties.getProperty("database.host"));
    System.out.println(properties.getProperty("database.port"));
    
    properties.put("hobby", "Coding");
    properties.store(new FileOutputStream("application.properties"), "Komentas");
} catch (FileNotFoundException error) {
    System.out.println("File tidak ketemu");
} catch(IOException error) {
    System.out.println("Gagal load data dari file");
}
```