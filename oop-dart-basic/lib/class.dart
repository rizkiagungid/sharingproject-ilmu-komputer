class Manusia {
  //deklarasi atribut/properti
  String nama = ''; //atribut nama bertipe  string dan nilai awal null

  //pembuatan konstruktor, nama konstruktor adalah nama class
  Manusia(nm) {
    //nm a/ sebuah parameter yg dipergunakan untuk menampung data
    this.nama = nm; //atribut nama memiliki data dari parameter nm
  }

  //deklarasi method/fungsi/behavior bernama makan
  void makan() {
    //Variabel adalah simbol yang digunakan untuk menyimpan sebuah nilai.
    //Sedangkan tipe data adalah jenis nilai yang akan disimpan
    //Contoh Variebel ($nama)
    print('$nama  makan nasii'); //tambahkan var nama pada string makan
  }
}

//awal inheritance
//inheritance adalah proses pewarisan data dan method dari suatu class yang telah ada kepada suatu class baru.

//Extends Extends pada java berfungsi untuk memanggil fungsi dari class lain, sehingga kita tidak perlu lagi
//membuat script yang sama pada class yang akan kita buat dengan class yang kita buat sebelumnya.
class ManusialMilenial extends Manusia {
  //String adalah Tipe data pada bahasa pemprograman.
  //Tipe data string adalah tipe data yang digunakan untuk menyimpan barisan karakter
  String email = '';
  // ignore: unused_field
  String _password = '';

  ManusialMilenial(String email) : super(email);

  void info() {
    print('namaku: $nama, Email:$email');
  }
} //akhir inheritance

// Class merupakan suatu blueprint atau cetakan untuk menciptakan suatu instant dari object.
class Programmer extends ManusialMilenial {
  Programmer(String email) : super(email);

//Void adalah sebuah fungsi ( function ) yang ada dalam sebuah bahasa pemrograman.
  @override
  void info() {
    //Fungsi print adalah sebuah fungsi yang digunakan untuk memunculkan output yang ingin kita print pada console.
    print('Email: $email pemiliknya adalah  $nama');
  }
}

class Dosen extends ManusialMilenial {
  Dosen(String nama) : super(nama);

//Overriding method adalah sebuah metode yang dipakai untuk kelas induk atau superclass dan nantinya akan dipakai
//untuk mendefinisikan ulang dengan kelas turunan atau subclass menggunakan nama metode serta parameter-parameter yang sama.
  @override
  void info() {
    print('$nama, telah memiliki Email= $email');
  }
}
