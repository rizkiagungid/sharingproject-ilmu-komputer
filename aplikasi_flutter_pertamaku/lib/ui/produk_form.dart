import 'package:flutter/material.dart';
import 'package:aplikasi_flutter_pertamaku/ui/produk_detail.dart';

class ProdukForm extends StatefulWidget {
  @override
  _ProdukFormState createState() => _ProdukFormState();
}

class _ProdukFormState extends State<ProdukForm> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Form Produk'),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            _textboxKodeProduk(),
            _textboxNamaProduk(),
            _textboxHargaProduk(),
            _tombolSimpan()
          ],
        ),
      ),
    );
  }

  _textboxKodeProduk() {
    return TextField(
      decoration: InputDecoration(labelText: "Kode Produk"),
    );
  }

  _textboxNamaProduk() {
    return TextField(
      decoration: InputDecoration(labelText: "Nama Produk"),
    );
  }

  _textboxHargaProduk() {
    return TextField(
      decoration: InputDecoration(labelText: "Harga"),
    );
  }

  _tombolSimpan() {
    return RaisedButton(
      child: Text('Simpan'),
      onPressed: () {},
    );
  }
}
