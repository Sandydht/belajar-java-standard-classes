# StringTokenizer Class
- StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil.
- Kita bisa memotong String dengan delimiter yang kita mau
- [Dokumentasi StringTokenizer](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringTokenizer.html)
- Kode: StringTokenizer Class
```java
String name = "Sandy Dwi Handoko Trapsilo";
StringTokenizer tokenizer = new StringTokenizer(name, " ");

while(tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}
```