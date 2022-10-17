import 'package:flutter/material.dart';
import 'package:menuresto/uihome/beranda.dart';
import 'package:menuresto/uihome/profile.dart';
import 'package:menuresto/uihome/wishlist.dart';

import '../constans.dart';

class HomePage extends StatefulWidget {
  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _bottomNavCurrentIndex = 0;
  List<Widget> _container = [
    new BerandaPage(),
    new WishlistPage(),
    new ProfilePage()
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: _container[_bottomNavCurrentIndex],
      bottomNavigationBar: BottomNavigationBar(
        selectedItemColor: Palette.bg1,
        type: BottomNavigationBarType.fixed,
        onTap: (index) {
          setState(() {
            _bottomNavCurrentIndex = index;
          });
        },
        currentIndex: _bottomNavCurrentIndex,
        items: [
          BottomNavigationBarItem(
              activeIcon: new Icon(
                Icons.home,
                color: Palette.bg1,
              ),
              icon: new Icon(Icons.home, color: Colors.grey),
              label: 'Beranda'),
          BottomNavigationBarItem(
              activeIcon: new Icon(Icons.add_shopping_cart, color: Palette.bg1),
              icon: new Icon(
                Icons.add_shopping_cart_rounded,
                color: Colors.grey,
              ),
              label: 'Wishlist'),
          BottomNavigationBarItem(
              activeIcon: new Icon(
                Icons.person,
                color: Palette.bg1,
              ),
              icon: new Icon(
                Icons.person_outline,
                color: Colors.grey,
              ),
              label: 'Profile')
        ],
      ),
      // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
