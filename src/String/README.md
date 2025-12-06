# String Class
- String adalah object, artinya dia memiliki representasi class nya.
- Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa aja yang tersedia di halaman dokumentasi javadocs nya
- [Dokumentasi String](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html)

## Method di String Class
| Method               | Keterangan |
|----------------------|------------|
| String toLowerCase() | Membuat string baru dengan format lower case |
| String toUpperCase() | Membuat string baru dengan format upper case |
| int length() | Mendapatkan panjang string |
| boolean startsWith(value) | Mengecek apakah dimulai dengan string value |
| boolean endsWith(value) | Mengecek apakah diakhiri dengan string value |
| String[] split(value) | Memotong string dengan string value |

## Immutable String
- String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan di Java adalah membuat String baru.
- Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder.

## StringBuffer vs StringBuilder
- Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String.
- Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe.
- Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak butuh paralel, cukup gunakan StringBuilder.
- Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder.
- [Dokumentasi StringBuffer](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuffer.html)
- [Dokumentasi StringBuilder](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html)