//import = untuk mengimport data dari package oop dart.

// ignore: unused_import
import 'package:oop_dart/oop_dart.dart' as oop_dart;
import '../lib/class.dart'; //import library class.dart

//awal program utama

//Void adalah sebuah fungsi ( function ) yang ada dalam sebuah bahasa pemrograman.
void main() {
  //Instansiasi/instance object adalah proses pembuatan object dari sebuah class

  //var = Variabel adalah simbol yang digunakan untuk menyimpan sebuah nilai.
  var programmer = new Programmer('Rizki Agung Sentosa');
  programmer.email = 'rizkiagungsentosa@bsi.ac.id';
  programmer.info();
  programmer.makan();

  //Fungsi print adalah sebuah fungsi yang digunakan untuk memunculkan output yang ingin kita print pada console.
  print('\n'); //pindah baris

  var dosen = new Dosen('Rizki');
  dosen.email = 'Rizki@bsi.ac.id';
  dosen.info();
  dosen.makan();

  print("Belajar Dart");
}
