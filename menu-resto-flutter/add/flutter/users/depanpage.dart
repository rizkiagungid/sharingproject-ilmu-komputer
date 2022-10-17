import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'package:tokoonline/constans.dart';
import 'package:tokoonline/models/kategori.dart';
import 'dart:async';
import 'dart:convert';

import 'package:tokoonline/models/produk.dart';

class DepanPage extends StatefulWidget {
  @override
  _DepanPageState createState() => _DepanPageState();
}

class _DepanPageState extends State<DepanPage> {
  List<Kategori> kategorilist = [];

  @override
  void initState() {
    super.initState();
    fetchKategori();
  }

  @override
  void dispose() {
    super.dispose();
    kategorilist = null;
  }

  Future<List<Kategori>> fetchKategori() async {
    List<Kategori> usersList;
    var params = "/kategoribyproduk";
    try {
      var jsonResponse = await http.get(Palette.sUrl + params);
      if (jsonResponse.statusCode == 200) {
        final jsonItems =
            json.decode(jsonResponse.body).cast<Map<String, dynamic>>();

        usersList = jsonItems.map<Kategori>((json) {
          return Kategori.fromJson(json);
        }).toList();

        setState(() {
          kategorilist = usersList;
        });
      }
    } catch (e) {
      usersList = kategorilist;
    }
    return usersList;
  }

  Future<Null> _refresh() {
    return fetchKategori().then((_kategori) {});
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey[100],
      body: RefreshIndicator(
        onRefresh: _refresh,
        child: Stack(children: <Widget>[
          SingleChildScrollView(
            child: Column(
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: <Widget>[
                  produkbyKategori(),
                ]),
          ),
        ]),
      ),
    );
  }

  Widget produkbyKategori() {
    return Container(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          for (int i = 0; i < kategorilist.length; i++)
            WidgetbyKategori(
                kategorilist[i].id, kategorilist[i].nama.toString(), i),
        ],
      ),
    );
  }
}

class WidgetbyKategori extends StatefulWidget {
  final Widget child;
  final int id;
  final String kategori;
  final int warna;

  WidgetbyKategori(this.id, this.kategori, this.warna, {Key key, this.child})
      : super(key: key);

  _WidgetbyKategoriState createState() => _WidgetbyKategoriState();
}

class _WidgetbyKategoriState extends State<WidgetbyKategori> {
  List<Produk> produklist = [];

  Future<List<Produk>> fetchProduk(String id) async {
    List<Produk> usersList;
    var params = "/produkbykategori?id=" + id;

    try {
      var jsonResponse = await http.get(Palette.sUrl + params);
      if (jsonResponse.statusCode == 200) {
        final jsonItems =
            json.decode(jsonResponse.body).cast<Map<String, dynamic>>();

        usersList = jsonItems.map<Produk>((json) {
          return Produk.fromJson(json);
        }).toList();

        setState(() {
          produklist = usersList;
        });
      }
    } catch (e) {
      usersList = produklist;
    }
    return usersList;
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.only(bottom: 20.0),
      padding: EdgeInsets.only(right: 10.0),
      color: Colors.white,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          Container(
            margin: EdgeInsets.only(top: 10.0, bottom: 10.0),
            padding: EdgeInsets.only(right: 10.0),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: <Widget>[
                Container(
                  child: Text(
                    widget.kategori,
                    style: TextStyle(color: Colors.white),
                  ),
                  width: 200.0,
                  padding: EdgeInsets.only(
                      left: 10.0, right: 10.0, top: 2.0, bottom: 2.0),
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.only(
                        topRight: Radius.circular(10.0),
                        bottomRight: Radius.circular(10.0)),
                    color: Palette.colors[widget.warna],
                    boxShadow: [
                      BoxShadow(
                          color: Palette.colors[widget.warna], spreadRadius: 1),
                    ],
                  ),
                ),
                InkWell(
                  onTap: () {
                    // Navigator.of(context).push(MaterialPageRoute<Null>(
                    //     builder: (BuildContext context) {
                    //   return new ProdukPage(
                    //       "kat", widget.id, 0, widget.kategori);
                    // }));
                  },
                  child: Text('Selengkapnya',
                      style: TextStyle(color: Colors.blue)),
                ),
              ],
            ),
          ),
          Container(
            height: 200.0,
            margin: EdgeInsets.only(bottom: 7.0),
            child: FutureBuilder<List<Produk>>(
              future: fetchProduk(widget.id.toString()),
              builder: (context, snapshot) {
                if (!snapshot.hasData)
                  return Center(child: CircularProgressIndicator());
                return ListView.builder(
                  scrollDirection: Axis.horizontal,
                  itemCount: snapshot.data.length,
                  itemBuilder: (BuildContext context, int i) => Card(
                    child: InkWell(
                      onTap: () {
                        // Navigator.of(context).push(MaterialPageRoute<Null>(
                        //     builder: (BuildContext context) {
                        //   return new ProdukDetailPage(
                        //       snapshot.data[i].id,
                        //       snapshot.data[i].judul,
                        //       snapshot.data[i].harga,
                        //       snapshot.data[i].hargax,
                        //       snapshot.data[i].thumbnail,
                        //       false);
                        // }));
                      },
                      child: Container(
                        width: 135.0,
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.start,
                          children: <Widget>[
                            new Image.network(
                              Palette.sUrl +"/"+ snapshot.data[i].thumbnail,
                              height: 110.0,
                              width: 110.0,
                            ),
                            Padding(
                              padding: EdgeInsets.only(top: 5.0),
                              child: Text(snapshot.data[i].judul),
                            ),
                            Padding(
                              padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
                              child: Text(snapshot.data[i].harga),
                            ),
                          ],
                        ),
                      ),
                    ),
                  ),
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}
