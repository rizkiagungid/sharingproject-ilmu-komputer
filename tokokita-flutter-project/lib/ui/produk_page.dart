import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:tokokita/model/produk.dart';
import 'package:tokokita/ui/produk_detail.dart';
import 'package:tokokita/ui/produk_form.dart';

class ProdukPage extends StatefulWidget {
  @override
  _ProdukPageState createState() => _ProdukPageState();
}

class _ProdukPageState extends State<ProdukPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('List Produk'),
        actions: [
          Padding(
              padding: EdgeInsets.only(right: 20.0),
              child: GestureDetector(
                child: Icon(Icons.add, size: 26.0),
                onTap: () async {
                  Navigator.push(
                      context,
                      new MaterialPageRoute(
                          builder: (content) => ProdukForm()));
                },
              ))
        ],
      ),
      drawer: Drawer(
        child: ListView(
          children: [
            ListTile(
              title: Text('Logout'),
              trailing: Icon(Icons.logout),
              onTap: () async {},
            )
          ],
        ),
      ),
      body: ListView(
        children: [
          ItemProduk(
              produk: Produk(
                  id: 1,
                  kodeProduk: 'A001',
                  namaProduk: 'Kamera',
                  hargaProduk: 5000000)),
          ItemProduk(
              produk: Produk(
                  id: 2,
                  kodeProduk: 'A002',
                  namaProduk: 'Kulkas',
                  hargaProduk: 2500000)),
          ItemProduk(
              produk: Produk(
                  id: 3,
                  kodeProduk: 'A003',
                  namaProduk: 'Mesin Cuci',
                  hargaProduk: 2000000)),
        ],
      ),
    );
  }
}

class ItemProduk extends StatelessWidget {
  final Produk produk;

  ItemProduk({this.produk});

  @override
  Widget build(BuildContext context) {
    var namaProduk = produk.namaProduk;
    return Container(
      child: GestureDetector(
        onTap: () {
          Navigator.push(
              context,
              new MaterialPageRoute(
                  builder: (context) => ProdukDetail(
                        produk: produk,
                      )));
        },
        child: Card(
          child: ListTile(
            title: Text(namaProduk),
            subtitle: Text(produk.hargaProduk.toString()),
          ),
        ),
      ),
    );
  }
}
