# Big Number
- Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long dan Double, di Java sudah disediakan class untuk handle data besar tersebut.
- BigInteger adalah class untuk handle tipe data Integer, dan
- BigDecimal adalah class untuk handle tipe data floating point.
- [Dokumentasi BigInteger](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigInteger.html)
- [Dokumentasi BigDecimal](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigDecimal.html)

## Method di BigInteger & BigDecimal
| Method | Operator |
|--------|----------|
| add | + |
| subtract | - |
| multiply | * |
| divide | / |
| mod | % |

- Kode: BigInteger
```java
BigInteger a = new BigInteger("100000000000000000000000000000");
BigInteger b = new BigInteger("100000000000000000000000000000");
BigInteger result = a.add(b);

System.out.println(result);
```