# Date & Calendar
- Setiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class Date & Calendar yang bisa kita gunakan sebagai representasi tanggal.
- Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru menggunakan Java Date Time API.

## Hubungan Date & Calendar
- Class Date adalah class representasi tanggal sampai presisi milisecond
- Namun di class Date sudah banyak method - method yang deprecated, sehingga untuk memanipulasi tanggal, kita sekarang harus melakukan kombinasi antara class Date & Calendar.
- Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal.
- [Dokumentasi Date](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Date.html)
- [Dokumentasi Calendar](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html)
- Kode: Menggunakan Date
```java
Date date = new Date();
long milisecond = date.getTime();

System.out.println(date);
System.out.println(milisecond);
```
- Kode: Menggunakan Calendar
```java
Calendar calendar = Calendar.getInstance();
calendar.set(Calendar.YEAR, 2000);
calendar.set(Calendar.MONTH, Calendar.JANUARY);
calendar.set(Calendar.DAY_OF_MONTH, 3);
calendar.set(Calendar.HOUR_OF_DAY, 0);
calendar.set(Calendar.MINUTE, 0);
calendar.set(Calendar.SECOND, 0);
calendar.set(Calendar.MILLISECOND, 0);

Date date = calendar.getTime();
long milisecond = date.getTime();

System.out.println(date);
System.out.println(milisecond);
```