import 'package:flutter/material.dart';
import 'package:menuresto/constans.dart';

class ProfilePage extends StatefulWidget {
  @override
  State<ProfilePage> createState() => _ProfilePageState();
}

class _ProfilePageState extends State<ProfilePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Palette.bg1,
        title: Text('Profil'),
      ),
      body: Center(
        child: Text(
          'Profile Laucher',
        ),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
