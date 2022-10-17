import 'package:flutter/material.dart';

class FirstScreen extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Material(
      color: Colors.amber,
      child: Center(
        child: Text(
          "Hello World",
          textDirection: TextDirection.ltr,
          style: TextStyle(color: Colors.deepPurple, fontSize: 40.0),
        ),
      ),
    );
  }
}