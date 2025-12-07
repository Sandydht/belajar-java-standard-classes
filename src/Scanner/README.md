# Scanner Class
- Scanner sebenarnya bagian dari Java IO (Input Output).
- Class Scanner hadir sejak Java 5.
- Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console, dan lain - lain.
- Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat program Java menggunakan console / terminal.
- [Dokumentasi Scanner](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html)

## Method di Scanner Class
| Method | Keterangan |
|--------|------------|
| nextLine() | Membaca string |
| nextInt() | Membaca int |
| nextLong() | Membaca long |
| nextBoolean() | Membaca boolean |

- Kode: Menggunakan Scanner

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Nama: ");
String name = scanner.nextLine();

System.out.println("Hello " + name);
```