## UUID Class
- Saat membuat aplikasi, kadang kita ingin membuat data unique, misal untuk kebutuhan data primary key.
- Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
- UUID adalah format standard untuk membuat unique value yang telah terjamin.
- [Dokumentasi UUID](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/UUID.html)
- [https://www.ietf.org/rfc/rfc4122.txt](https://www.ietf.org/rfc/rfc4122.txt)
- Kode: UUID Class

```java
for(int i = 0; i< 100; i++) {
    UUID uuid = UUID.randomUUID();
    System.out.println(uuid);
}
```