# StringJoiner Class
- StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter.
- StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya.
- Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau.
- [Dokumentasi StringJoiner](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringJoiner.html)
- Kode: StringJoiner

```java
String[] names = {"Sandy", "Dwi", "Handoko", "Trapsilo"};
StringJoiner joiner = new StringJoiner(
        /*delimiter*/ "||", /*prefix*/ "[", /*suffix*/ "]"
);

for (var name : names) {
    joiner.add(name);
}

System.out.println(joiner.toString());
```