# Runtime Class
- Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan.
- Informasi itu terdapat di class Runtime.
- Class Runtime tidak bisa dibuat secara otomatis, Java akan membuat single object. Kita bisa mengakses object tersebut menggunakan static method getRuntime() milik class Runtime.
- [Dokumentasi Runtime Class](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html)

## Method di Runtime Class
| Method                    | Keterangan |
|---------------------------|------------|
| int availableProcessors() | Mendapatkan jumlah core cpu |
| long freeMemory()         | Mendapatkan jumlah memory bebas di JVM |
| long totalMemory()        | Mendapatkan jumlah total memory di JVM |
| long maxMemory()          | Mendapatkan jumlah maksimum memory di JVM |
| void gc() | Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai |

