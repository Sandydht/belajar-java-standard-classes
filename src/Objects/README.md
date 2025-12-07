# Objects Class
- Awas jangan tertukar, ini class Objects, bukan Object.
- Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau melakukan pengecekan sebelum operasi nya dilakukan.
- [Dokumentasi Objects](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html)
- Kode: Tanpa Objects
```java
if (product != null) {
    product.toString();    
}

if (product != null) {
    product.hashCode();    
}

if (product != null) {
    product.equals(product2);    
}
```
- Kode: Dengan Objects
```java
var string = Objects.toString(product);
var hashCode = Objects.hashCode(product);
var equals = Objects.equals(product, product2);
```