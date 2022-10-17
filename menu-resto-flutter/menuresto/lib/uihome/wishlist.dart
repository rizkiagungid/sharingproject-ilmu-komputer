import 'package:flutter/material.dart';
import 'package:menuresto/constans.dart';

class WishlistPage extends StatefulWidget {
  @override
  State<WishlistPage> createState() => _WishlistPageState();
}

class _WishlistPageState extends State<WishlistPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Palette.bg1,
        title: Text('Pesanan Anda'),
      ),
      body: Center(
        child: Text(
          'Wishlist Laucher',
        ),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
