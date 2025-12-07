# Random Class
- Random Class adalah class yang bisa kita gunakan untuk men-generate random number.
- [Dokumentasi Random Class](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html)
- Kode: Random Class
```java
Random random = new Random();

for (int i = 0; i < 100; i++) {
    var value = random.nextInt(1000);
    System.out.println(value);
}
```