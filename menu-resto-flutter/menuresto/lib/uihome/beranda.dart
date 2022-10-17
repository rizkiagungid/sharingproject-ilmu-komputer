import 'package:flutter/material.dart';
import 'package:menuresto/constans.dart';
import 'package:menuresto/uihome/menu.dart';

class BerandaPage extends StatefulWidget {
  @override
  State<BerandaPage> createState() => _BerandaPageState();
}

class _BerandaPageState extends State<BerandaPage>
    with SingleTickerProviderStateMixin {
  late TabController _tabController;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(vsync: this, length: 1);
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Menu Resto'),
        backgroundColor: Palette.bg1,
      ),
      body: TabBarView(
        physics: NeverScrollableScrollPhysics(),
        controller: _tabController,
        children: [MenuPage()],
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
